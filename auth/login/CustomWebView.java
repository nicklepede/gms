package com.google.android.gms.auth.login;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.ModuleContext;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;
import defpackage.abpj;
import defpackage.abpk;
import defpackage.dvni;
import defpackage.fkdo;
import defpackage.vfv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CustomWebView extends WebView {
    boolean a;
    public boolean b;

    public CustomWebView(Context context) {
        super(fkdo.e() ? b(context) : context);
    }

    private static Context b(Context context) {
        ModuleContext moduleContext;
        Context context2 = context;
        while (!(context2 instanceof Activity)) {
            if (!(context2 instanceof ContextWrapper)) {
                return context;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        Activity activity = (Activity) context2;
        if (!(activity instanceof MinuteMaidChimeraActivity) || (moduleContext = ModuleContext.getModuleContext(context2)) == null) {
            return context;
        }
        Context containerContext = moduleContext.getContainerContext();
        ClassLoader classLoader = containerContext.getClass().getClassLoader();
        return classLoader != null ? new abpj(containerContext, ((MinuteMaidChimeraActivity) activity).B, classLoader, moduleContext) : context;
    }

    public final void a() {
        this.a = true;
    }

    @Override // android.webkit.WebView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        LocaleList forLanguageTags;
        if (Build.VERSION.SDK_INT >= 24) {
            forLanguageTags = LocaleList.forLanguageTags("zz");
            editorInfo.hintLocales = forLanguageTags;
        }
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        dvni dvniVar = vfv.a;
        if (!this.b || onCreateInputConnection == null) {
            return onCreateInputConnection;
        }
        if (editorInfo.privateImeOptions == null) {
            editorInfo.privateImeOptions = "escapeNorth";
        } else {
            editorInfo.privateImeOptions = String.valueOf(editorInfo.privateImeOptions).concat(",escapeNorth");
        }
        return new abpk(this, onCreateInputConnection);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean performLongClick() {
        if (this.a) {
            return super.performLongClick();
        }
        return true;
    }

    public CustomWebView(Context context, AttributeSet attributeSet) {
        super(fkdo.e() ? b(context) : context, attributeSet);
    }

    public CustomWebView(Context context, AttributeSet attributeSet, int i) {
        super(fkdo.e() ? b(context) : context, attributeSet, i);
    }
}
