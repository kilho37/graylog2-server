/**
 * This file is part of Graylog.
 *
 * Graylog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog2.restclient.models.api.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class CreateExtractorRequest extends ApiRequest {

    public String title;

    @JsonProperty("cut_or_copy")
    public String cutOrCopy;

    @JsonProperty("target_field")
    public String targetField;

    @JsonProperty("source_field")
    public String sourceField;

    @JsonProperty("extractor_type")
    public String extractorType;

    @JsonProperty("extractor_config")
    public Map<String, Object> extractorConfig;

    public Map<String, Map<String, Object>> converters;

    @JsonProperty("condition_type")
    public String conditionType;

    @JsonProperty("condition_value")
    public String conditionValue;

    public long order;

}
