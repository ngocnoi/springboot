package com.group5.librarymanagement.Service;

import java.util.List;

import com.group5.librarymanagement.Entity.Language;

public interface LanguageService {
	public abstract Language getLanguage(Integer id);
	public abstract void addLanguage(Language language);
	public abstract void updateLanguage(Language language, Integer id);
	public abstract void deleteLanguage(Integer id);
	public abstract List<Language> listLanguage();
}
