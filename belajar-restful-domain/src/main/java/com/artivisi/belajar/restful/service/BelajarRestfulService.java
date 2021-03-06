/**
 * Copyright (C) 2011 ArtiVisi Intermedia <info@artivisi.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.artivisi.belajar.restful.service;

import java.util.List;

import com.artivisi.belajar.restful.domain.ApplicationConfig;

public interface BelajarRestfulService {
	void save(ApplicationConfig ac);
	void delete(ApplicationConfig ac);
	ApplicationConfig findApplicationConfigById(String id);
	List<ApplicationConfig> findAllApplicationConfigs(Long start, Integer rows);
	Long countAllApplicationConfigs();
	Long countApplicationConfigs(String search);
	List<ApplicationConfig> findApplicationConfigs(String search, Long longValue, Integer i);
}
