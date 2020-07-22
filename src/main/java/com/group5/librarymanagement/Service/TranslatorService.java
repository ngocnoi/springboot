package com.group5.librarymanagement.Service;

import java.util.List;

import com.group5.librarymanagement.Entity.Translator;

public interface TranslatorService {
	public abstract Translator getTranslator(Integer id);
	public abstract void addTranslator(Translator translator);
	public abstract void updateTranslator(Translator translator, Integer id);
	public abstract void deleteTranslator(Integer id);
	public abstract List<Translator> listTranslator();
}
