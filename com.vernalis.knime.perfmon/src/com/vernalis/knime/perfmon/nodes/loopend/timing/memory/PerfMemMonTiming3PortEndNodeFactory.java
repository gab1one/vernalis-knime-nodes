/*******************************************************************************
 * Copyright (c) 2016, Vernalis (R&D) Ltd
 *  This program is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU General Public License, Version 3, as 
 *  published by the Free Software Foundation.
 *  
 *   This program is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU General Public License for more details.
 *   
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, see <http://www.gnu.org/licenses>
 ******************************************************************************/
package com.vernalis.knime.perfmon.nodes.loopend.timing.memory;

import com.vernalis.knime.perfmon.nodes.timing.abstrct.AbstractPerfMemMonTimingEndNodeFactory;

/**
 * <code>NodeFactory</code> for the 2 port timing/memory monitoring loop end
 *
 * @author S. Roughley
 */
public class PerfMemMonTiming3PortEndNodeFactory extends AbstractPerfMemMonTimingEndNodeFactory {

	public PerfMemMonTiming3PortEndNodeFactory() {
		super(3);
	}

}