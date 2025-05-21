package com.google.android.gms.wallet.shared.common;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.wallet.dynamite.logging.e;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public abstract class ExceptionHandlingAsyncTask extends AsyncTask {
    protected final Context f;

    public ExceptionHandlingAsyncTask(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
    }

    protected abstract Object a(Object... objArr);

    @Override // android.os.AsyncTask
    protected final Object doInBackground(Object... objArr) {
        try {
            return a(objArr);
        } catch (Throwable th) {
            e.a(this.f, th, null);
            return null;
        }
    }
}
