package com.google.android.gms.providerinstaller;

import android.content.Context;
import android.system.Os;
import android.util.Log;
import com.google.android.gms.providerinstaller.FlagRegistrar;
import defpackage.auvf;
import defpackage.dxxt;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class FlagRegistrar {
    static final AtomicBoolean a = new AtomicBoolean(false);
    public static final /* synthetic */ int c = 0;
    public ExecutorService b = Executors.newSingleThreadExecutor(new auvf("FlagRegistrar"));

    final synchronized void a(final Context context) {
        AtomicBoolean atomicBoolean = a;
        if (!atomicBoolean.get() && !Objects.equals(context.getPackageName(), "com.android.vending")) {
            dxxt.e(context);
            ExecutorService executorService = this.b;
            if (executorService == null) {
                Log.w("FlagRegistrar", "register() failed.");
            } else {
                executorService.execute(new Runnable() { // from class: czfz
                    /* JADX WARN: Finally extract failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        czga czgaVar;
                        FlagRegistrar flagRegistrar = FlagRegistrar.this;
                        Objects.requireNonNull(flagRegistrar.b);
                        Context context2 = context;
                        String[] n = auwr.b(context2).n(Os.getuid());
                        if (n == null || n.length == 0 || n[0] == null) {
                            Log.w("FlagRegistrar", "Could not find determine package name.");
                            czgaVar = null;
                        } else {
                            czgaVar = new czga(context2, n);
                        }
                        if (czgaVar == null) {
                            Log.w("FlagRegistrar", "Unable to determine config package name");
                            return;
                        }
                        dydy dydyVar = fuka.a;
                        String c2 = dxxi.c(czgaVar, "com.google.android.gms.providerinstaller");
                        aszs aszsVar = cyjh.a;
                        try {
                            try {
                                ((eqcy) new dxyz(new cyki(context2)).e(c2, 1, new String[0])).u();
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
