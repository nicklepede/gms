package com.google.android.gms.chimera.container.cellophane;

import android.app.Activity;
import android.app.ComponentCaller;
import android.app.Fragment;
import android.app.PictureInPictureUiState;
import android.app.TaskStackBuilder;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.chimera.ModuleContext;
import defpackage.aocx;
import defpackage.bhib;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsCoreCellophaneActivity extends aocx {
    @Override // defpackage.psf, defpackage.psi, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        ModuleContext moduleContext = ModuleContext.getModuleContext(this);
        if (moduleContext != null) {
            setTracer(new bhib(moduleContext, getClass(), 6));
        }
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
    }

    @Override // defpackage.aocx, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi
    public /* bridge */ /* synthetic */ void onActivityResult(int i, int i2, Intent intent, ComponentCaller componentCaller) {
        super.onActivityResult(i, i2, intent, componentCaller);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    @Deprecated
    public /* bridge */ /* synthetic */ void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    @Deprecated
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi
    @Deprecated
    public /* bridge */ /* synthetic */ void onBackgroundVisibleBehindChanged(boolean z) {
        super.onBackgroundVisibleBehindChanged(z);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onContentChanged() {
        super.onContentChanged();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onContextItemSelected(MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
    }

    @Override // defpackage.aocx, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.View.OnCreateContextMenuListener
    public /* bridge */ /* synthetic */ void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ CharSequence onCreateDescription() {
        return super.onCreateDescription();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onCreateNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        super.onCreateNavigateUpTaskStack(taskStackBuilder);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onCreatePanelMenu(int i, Menu menu) {
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ View onCreatePanelView(int i) {
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    @Deprecated
    public /* bridge */ /* synthetic */ boolean onCreateThumbnail(Bitmap bitmap, Canvas canvas) {
        return super.onCreateThumbnail(bitmap, canvas);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.LayoutInflater.Factory2
    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        super.onGetDirectActions(cancellationSignal, consumer);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return super.onKeyShortcut(i, keyEvent);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onLocalVoiceInteractionStarted() {
        super.onLocalVoiceInteractionStarted();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onLocalVoiceInteractionStopped() {
        super.onLocalVoiceInteractionStopped();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onLowMemory() {
        super.onLowMemory();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return super.onMenuItemSelected(i, menuItem);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    @Deprecated
    public /* bridge */ /* synthetic */ void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onNavigateUp() {
        return super.onNavigateUp();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    @Deprecated
    public /* bridge */ /* synthetic */ boolean onNavigateUpFromChild(Activity activity) {
        return super.onNavigateUpFromChild(activity);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi
    public /* bridge */ /* synthetic */ void onNewIntent(Intent intent, ComponentCaller componentCaller) {
        super.onNewIntent(intent, componentCaller);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        super.onPerformDirectAction(str, bundle, cancellationSignal, consumer);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    @Deprecated
    public /* bridge */ /* synthetic */ void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onPictureInPictureRequested() {
        return super.onPictureInPictureRequested();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
    }

    @Override // defpackage.aocx, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onPostCreate(bundle, persistableBundle);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onPrepareNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        super.onPrepareNavigateUpTaskStack(taskStackBuilder);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onPreparePanel(int i, View view, Menu menu) {
        return super.onPreparePanel(i, view, menu);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onProvideAssistData(Bundle bundle) {
        super.onProvideAssistData(bundle);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        super.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ Uri onProvideReferrer() {
        return super.onProvideReferrer();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // defpackage.aocx, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onRestoreInstanceState(bundle, persistableBundle);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ Object onRetainNonConfigurationInstance() {
        return super.onRetainNonConfigurationInstance();
    }

    @Override // defpackage.aocx, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onSearchRequested() {
        return super.onSearchRequested();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    @Deprecated
    public /* bridge */ /* synthetic */ void onStateNotSaved() {
        super.onStateNotSaved();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onTopResumedActivityChanged(boolean z) {
        super.onTopResumedActivityChanged(z);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ boolean onTrackballEvent(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.content.ComponentCallbacks2
    public /* bridge */ /* synthetic */ void onTrimMemory(int i) {
        super.onTrimMemory(i);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onUserInteraction() {
        super.onUserInteraction();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    @Deprecated
    public /* bridge */ /* synthetic */ void onVisibleBehindCanceled() {
        super.onVisibleBehindCanceled();
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    @Override // defpackage.aocx, defpackage.psf, defpackage.psi, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public /* bridge */ /* synthetic */ void setTheme(int i) {
        super.setTheme(i);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.LayoutInflater.Factory
    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        super.onMultiWindowModeChanged(z, configuration);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity
    public /* bridge */ /* synthetic */ void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super.onPictureInPictureModeChanged(z, configuration);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, String[] strArr, int[] iArr, int i2) {
        super.onRequestPermissionsResult(i, strArr, iArr, i2);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onSearchRequested(SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return super.onWindowStartingActionMode(callback, i);
    }

    @Override // defpackage.aocx, defpackage.aodb, defpackage.psf, defpackage.psi, android.view.ContextThemeWrapper
    public /* bridge */ /* synthetic */ void setTheme(Resources.Theme theme) {
        super.setTheme(theme);
    }
}
