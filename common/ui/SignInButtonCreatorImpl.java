package com.google.android.gms.common.ui;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.SignInButtonConfig;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.aqbk;
import defpackage.atyl;
import defpackage.atym;
import defpackage.auqk;
import defpackage.auql;
import defpackage.auqm;
import defpackage.bblp;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class SignInButtonCreatorImpl extends atyl {
    public static final String CHIMERA_MODULE_ID = "com.google.android.gms.signinbutton_dynamite";
    private final Lock a = new ReentrantLock();
    private Context b;
    private Context c;

    private final bblp a(bblp bblpVar, auqm auqmVar) {
        atym asInterface;
        Context context = (Context) ObjectWrapper.a(bblpVar);
        Lock lock = this.a;
        lock.lock();
        try {
            Context applicationContext = context.getApplicationContext();
            Context context2 = this.b;
            if (context2 == null || applicationContext != context2) {
                Context a = aqbk.a(applicationContext, CHIMERA_MODULE_ID);
                if (a == null) {
                    Log.e("SignInButtonProxy", "Unexpected null moduleContext for: com.google.android.gms.signinbutton_dynamite. newCreator failed and will return null");
                    return null;
                }
                this.c = a;
                this.b = applicationContext;
            }
            lock.unlock();
            try {
                asInterface = atyl.asInterface(aqbk.b(this.c.getClassLoader(), "com.google.android.gms.common.ui.SignInButtonCreatorChimeraImpl"));
            } catch (RemoteException e) {
                Log.e("SignInButtonProxy", "Failed to create SignInButton using dynamite package", e);
            }
            if (asInterface != null) {
                return auqmVar.a(asInterface, new ObjectWrapper(new Context[]{this.c, context}));
            }
            Log.e("SignInButtonProxy", "Failed to get the actual SignInButtonCreator.");
            return null;
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.atym
    public bblp newSignInButton(bblp bblpVar, int i, int i2) {
        return a(bblpVar, new auqk(i, i2));
    }

    @Override // defpackage.atym
    public bblp newSignInButtonFromConfig(bblp bblpVar, SignInButtonConfig signInButtonConfig) {
        return a(bblpVar, new auql(signInButtonConfig));
    }
}
