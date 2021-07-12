// Copyright 2021 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.edibleFlora.worldGenerator;


import org.terasology.gestalt.entitysystem.component.EmptyComponent;

/**
 * A flag component used to mark prefabs that contain a bush definition.
 * The current stage of the bush definition will then be placed in the world on chunk generation.
 */
public class WildBushComponent extends EmptyComponent<WildBushComponent> {
}
