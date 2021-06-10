package com.brainmentors.todo.repo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import com.brainmentors.todo.dto.ToDoDTO;
import com.brainmentors.todo.utils.Constants;

//Singleton class - Design pattern

public class ToDoRepo implements IToDoRepo, Serializable {
	private File file;
	private static ToDoRepo todoRepo;
	
//	public ToDoRepo() throws IOException {
//		// TODO Auto-generated constructor stub
//		file = new File(Constants.FILE_PATH);
//		if(!file.exists()) {
//			file.createNewFile();
//			System.out.println("File Created...");
//		}
//	}
	
	private ToDoRepo() throws IOException {
		// TODO Auto-generated constructor stub
		file = new File(Constants.FILE_PATH);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File Created...");
		}
	}
	
	public static IToDoRepo getInstance() {
		if(todoRepo == null) {
			try {
				todoRepo = new ToDoRepo();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		return todoRepo;
	}
	
	@Override
	public boolean addTask(ToDoDTO todo) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ArrayList<ToDoDTO> list = printTask();
		if(list != null && list.size() > 0) {
			list.add(todo);
		}
		else {
			list = new ArrayList<>();
			list.add(todo);
		}
		
		FileOutputStream fo = null;
		ObjectOutputStream os = null;
		try {
			fo = new FileOutputStream(file);
			os = new ObjectOutputStream(fo);
			os.writeObject(list);
		}
		finally {
			if(os != null) {
				os.close();
			}
			if(fo != null) {
				fo.close();
			}
		}
		return true;
	}

	@Override
	public boolean removeTask(ToDoDTO todo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTask(ToDoDTO todo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchTask(ToDoDTO todo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<ToDoDTO> printTask() throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fs = null;
		ObjectInputStream os = null;
		ArrayList<ToDoDTO> list = new ArrayList<>();
		try {
			fs = new FileInputStream(file);
			os = new ObjectInputStream(fs);
			ArrayList<ToDoDTO> todolist = (ArrayList<ToDoDTO>)os.readObject();
			if(todolist.size() > 0) {
				for(ToDoDTO todoDTO : todolist) {
					list.add(todoDTO);
				}
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(os != null) {
				os.close();
			}
			if(fs != null) {
				fs.close();
			}
		}
		
		return list;
	}
	
}
