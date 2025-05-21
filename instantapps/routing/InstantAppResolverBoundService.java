package com.google.android.gms.instantapps.routing;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import com.google.android.gms.instantapps.routing.InstantAppResolverBoundService;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asom;
import defpackage.asot;
import defpackage.asqh;
import defpackage.boff;
import defpackage.bokb;
import defpackage.bokt;
import defpackage.dmko;
import defpackage.ejhf;
import defpackage.fpfx;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class InstantAppResolverBoundService extends BoundService {
    public static final asot a = asot.b("InstantAppResolver", asej.INSTANT_APPS);

    @Override // com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boff a2 = boff.a(this);
        printWriter.println();
        printWriter.printf("\nInstant Apps enabled: %s\n", dmko.a.b());
        printWriter.printf("Instant App resolver enabled: %s\n", Boolean.valueOf(fpfx.g()));
        bokt boktVar = a2.c;
        printWriter.printf("Accounts: %s\n", Arrays.toString(boktVar.e()));
        printWriter.printf("Opt-in account: %s\n", boktVar.a());
        printWriter.printf("Opt-in state: %s\n", Integer.valueOf(a2.d.a()));
        try {
            printWriter.println("\nEvent Log:");
            asom asomVar = new asom(a2.p);
            while (asomVar.hasNext()) {
                printWriter.println(asomVar.next());
            }
        } catch (ConcurrentModificationException e) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 5271)).x("Failed to dump Event log");
        }
        printWriter.println();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        if (!asqh.c()) {
            return null;
        }
        if (!Objects.equals(intent.getAction(), "android.intent.action.RESOLVE_EPHEMERAL_PACKAGE") && !Objects.equals(intent.getAction(), "android.intent.action.RESOLVE_INSTANT_APP_PACKAGE")) {
            ((ejhf) ((ejhf) a.i()).ah((char) 5273)).B("Unexpected action: %s", intent.getAction());
            return null;
        }
        bokb bokbVar = new bokb(new asmf(1, 10).submit(new Callable() { // from class: bojy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return boff.a(InstantAppResolverBoundService.this);
            }
        }));
        try {
            ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class).invoke(bokbVar, this);
            return bokbVar.onBind(intent);
        } catch (Exception e) {
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 5272)).x("Failed to call attachBaseContext");
            return null;
        }
    }
}
