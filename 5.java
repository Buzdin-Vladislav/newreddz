﻿<?xml version="1.0" encoding="utf-8"?>
<Project ToolsVersion="14.0" DefaultTargets="Build" xmlns="http://schemas.microsoft.com/developer/msbuild/2003">
  <Import Project="$(MSBuildExtensionsPath)\$(MSBuildToolsVersion)\Microsoft.Common.props" Condition="Exists('$(MSBuildExtensionsPath)\$(MSBuildToolsVersion)\Microsoft.Common.props')" />
  <PropertyGroup>
    <Configuration Condition=" '$(Configuration)' == '' ">Debug</Configuration>
    <Platform Condition=" '$(Platform)' == '' ">AnyCPU</Platform>
    <SchemaVersion>2.0</SchemaVersion>
    <ProjectGuid>{2697b855-11bd-4810-b8df-48ac3ecb30ae}</ProjectGuid>
    <ArchitectureToolsVersion>2.0.0.0</ArchitectureToolsVersion>
    <Name>CompServiceClassDiagram</Name>
    <RootNamespace>CompServiceClassDiagram</RootNamespace>
  </PropertyGroup>
  <PropertyGroup Condition=" '$(Configuration)|$(Platform)' == 'Debug|AnyCPU' ">
    <OutputPath>bin\Debug\</OutputPath>
  </PropertyGroup>
  <PropertyGroup Condition=" '$(Configuration)|$(Platform)' == 'Release|AnyCPU' ">
    <OutputPath>bin\Release\</OutputPath>
  </PropertyGroup>
  <PropertyGroup>
    <VisualStudioVersion Condition="'$(VisualStudioVersion)' == ''">10.0</VisualStudioVersion>
    <VSToolsPath Condition="'$(VSToolsPath)' == ''">$(MSBuildExtensionsPath)\Microsoft\VisualStudio\v$(VisualStudioVersion)</VSToolsPath>
  </PropertyGroup>
  <Import Project="$(VSToolsPath)\ArchitectureTools\Microsoft.VisualStudio.TeamArchitect.ModelingProject.targets" Condition="'$(VSToolsPath)' != ''" />
  <ItemGroup>
    <Folder Include="ModelDefinition\" />
    <Content Include="CompService.classdiagram">
      <SubType>Content</SubType>
    </Content>
    <Content Include="CompService.classdiagram.layout">
      <SubType>Content</SubType>
      <DependentUpon>CompService.classdiagram</DependentUpon>
    </Content>
    <Content Include="ModelDefinition\CompServiceClassDiagram.uml">
      <SubType>Content</SubType>
    </Content>
  </ItemGroup>
</Project>