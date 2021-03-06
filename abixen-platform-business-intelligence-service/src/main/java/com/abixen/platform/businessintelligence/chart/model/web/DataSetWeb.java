/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.businessintelligence.chart.model.web;

import com.abixen.platform.core.util.WebModelJsonSerialize;
import com.abixen.platform.businessintelligence.chart.model.impl.DataSet;
import com.abixen.platform.businessintelligence.chart.model.impl.DataSetSeries;
import com.abixen.platform.businessintelligence.chart.model.impl.DataSetSeriesColumn;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Set;


@JsonDeserialize(as = DataSet.class)
public interface DataSetWeb {

    @JsonView(WebModelJsonSerialize.class)
    Long getId();

    @JsonView(WebModelJsonSerialize.class)
    DataSetSeriesColumn getDomainXSeriesColumn();

    @JsonView(WebModelJsonSerialize.class)
    DataSetSeriesColumn getDomainZSeriesColumn();


    @JsonView(WebModelJsonSerialize.class)
    Set<DataSetSeries> getDataSetSeries();


}
