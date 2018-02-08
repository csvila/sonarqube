/*
 * SonarQube
 * Copyright (C) 2009-2018 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.db.webhook;

import javax.annotation.Nullable;

public class WebhookDto {

  /** Technical unique identifier, can't be null */
  protected String uuid;
  /** Name, can't be null */
  protected String name;
  /** URL, can't be null */
  protected String url;

  @Nullable
  protected String organizationUuid;

  @Nullable
  protected String projectUuid;

  /** createdAt, can't be null */
  protected Long createdAt;
  /** URL, can be null */
  @Nullable
  protected Long updatedAt;

  public WebhookDto setUuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  public WebhookDto setName(String name) {
    this.name = name;
    return this;
  }

  public WebhookDto setUrl(String url) {
    this.url = url;
    return this;
  }

  public WebhookDto setOrganizationUuid(@Nullable String organizationUuid) {
    this.organizationUuid = organizationUuid;
    return this;
  }

  public WebhookDto setProjectUuid(@Nullable String projectUuid) {
    this.projectUuid = projectUuid;
    return this;
  }

  WebhookDto setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  WebhookDto setUpdatedAt(@Nullable Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public String getUuid() {
    return uuid;
  }

  public String getName() {
    return name;
  }

  public String getUrl() {
    return url;
  }

  @Nullable
  public String getOrganizationUuid() {
    return organizationUuid;
  }

  @Nullable
  public String getProjectUuid() {
    return projectUuid;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  @Nullable
  public Long getUpdatedAt() {
    return updatedAt;
  }
}