package com.springbasic.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Scope("prototype")
public class Cycle 
{
@Value("Ranger")	
private String name;
@Value("2020")
private int model;
@Value("#{mat}")
private List<String> material;
public String getName() {
	return name;
}
public List<String> getMaterial() {
	return material;
}
public void setMaterial(List<String> material) {
	this.material = material;
}
public void setName(String name) {
	this.name = name;
}
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
@Override
public String toString() {
	return "Cycle [name=" + name + ", model=" + model + ", material=" + material + "]";
}
}
