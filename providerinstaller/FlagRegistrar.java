package com.google.android.gms.providerinstaller;

import android.content.Context;
import android.system.Os;
import android.util.Log;
import com.google.android.gms.providerinstaller.FlagRegistrar;
import defpackage.asrl;
import defpackage.dvms;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class FlagRegistrar {
    static final AtomicBoolean a = new AtomicBoolean(false);
    public static final /* synthetic */ int c = 0;
    public ExecutorService b = Executors.newSingleThreadExecutor(new asrl("FlagRegistrar"));

    final synchronized void a(final Context context) {
        AtomicBoolean atomicBoolean = a;
        if (!atomicBoolean.get() && !Objects.equals(context.getPackageName(), "com.android.vending")) {
            dvms.e(context);
            ExecutorService executorService = this.b;
            if (executorService == null) {
                Log.w("FlagRegistrar", "register() failed.");
            } else {
                executorService.execute(new Runnable() { // from class: cwwc
                    /* JADX WARN: Finally extract failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        cwwd cwwdVar;
                        FlagRegistrar flagRegistrar = FlagRegistrar.this;
                        Objects.requireNonNull(flagRegistrar.b);
                        Context context2 = context;
                        String[] n = assx.b(context2).n(Os.getuid());
                        if (n == null || n.length == 0 || n[0] == null) {
                            Log.w("FlagRegistrar", "Could not find determine package name.");
                            cwwdVar = null;
                        } else {
                            cwwdVar = new cwwd(context2, n);
                        }
                        if (cwwdVar == null) {
                            Log.w("FlagRegistrar", "Unable to determine config package name");
                            return;
                        }
                        int i = frpu.a;
                        String c2 = dvmh.c(cwwdVar, "com.google.android.gms.providerinstaller");
                        aqxd aqxdVar = cvzk.a;
                        try {
                            try {
                                ((enpf) new dvnz(new cwal(context2)).e(c2, 1, new String[0])).u();
                                ExecutorService executorService2 = flagRegistrar.b;
                                if (executorService2 != null) {
                                    executorService2.shutdown();
                                    flagRegistrar.b = null;
                                }
                            } catch (InterruptedException unused) {
                                ExecutorService executorService3 = flagRegistrar.b;
                                if (executorService3 != null) {
                                    executorService3.shutdown();
                                    flagRegistrar.b = null;
                                }
                            } catch (ExecutionException e) {
                                Log.w("FlagRegistrar", a.x(c2, "Failed to register "), e.getCause());
                                ExecutorService executorService4 = flagRegistrar.b;
                                if (executorService4 != null) {
                                    executorService4.shutdown();
                                    flagRegistrar.b = null;
                                }
                            }
                        } catch (Throwable th) {
                            ExecutorService executorService5 = flagRegistrar.b;
                            if (executorService5 != null) {
                                executorService5.shutdown();
                                flagRegistrar.b = null;
                            }
                            throw th;
                        }
                    }
                });
                atomicBoolean.set(true);
            }
        }
    }
}
