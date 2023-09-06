/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  useColorScheme,
  View,
  Button
} from 'react-native';
import { NativeModules } from 'react-native'


const App = () => {
  console.log("12121");
  
  console.log(NativeModules.NativeUI)
  return (
    <>
    <View>
      <Button
      title='Click Me'
      onPress={() => NativeModules.NativeUI.navigateToExample()}/>
    </View>
    </>
  )
}

export default App;
