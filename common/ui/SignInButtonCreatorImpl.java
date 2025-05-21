package com.google.android.gms.common.ui;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.SignInButtonConfig;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.anzs;
import defpackage.arvw;
import defpackage.arvx;
import defpackage.asmq;
import defpackage.asmr;
import defpackage.asms;
import defpackage.azht;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class SignInButtonCreatorImpl extends arvw {
    public static final String CHIMERA_MODULE_ID = "com.google.android.gms.signinbutton_dynamite";
    private final Lock a = new ReentrantLock();
    private Context b;
    private Context c;

    private final azht a(azht azhtVar, asms asmsVar) {
        arvx asInterface;
        Context context = (Context) ObjectWrapper.a(azhtVar);
        Lock lock = this.a;
        lock.lock();
        try {
            Context applicationContext = context.getApplicationContext();
            Context context2 = this.b;
            if (context2 == null || applicationContext != context2) {
                Context a = anzs.a(applicationContext, CHIMERA_MODULE_ID);
                if (a == null) {
                    Log.e("SignInButtonProxy", "Unexpected null moduleContext for: com.google.android.gms.signinbutton_dynamite. newCreator failed and will return null");
                    return null;
                }
                this.c = a;
                this.b = applicationContext;
            }
            lock.unlock();
            try {
                asInterface = arvw.asInterface(anzs.b(this.c.getClassLoader(), "com.google.android.gms.common.ui.SignInButtonCreatorChimeraImpl"));
            } catch (RemoteException e) {
                Log.e("SignInButtonProxy", "Failed to create SignInButton using dynamite package", e);
            }
            if (asInterface != null) {
                return asmsVar.a(asInterface, new ObjectWrapper(new Context[]{this.c, context}));
            }
            Log.e("SignInButtonProxy", "Failed to get the actual SignInButtonCreator.");
            return null;
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.arvx
    public azht newSignInButton(azht azhtVar, int i, int i2) {
        return a(azhtVar, new asmq(i, i2));
    }

    @Override // defpackage.arvx
    public azht newSignInButtonFromConfig(azht azhtVar, SignInButtonConfig signInButtonConfig) {
        return a(azhtVar, new asmr(signInButtonConfig));
    }
}
