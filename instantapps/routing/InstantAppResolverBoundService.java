package com.google.android.gms.instantapps.routing;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import com.google.android.gms.instantapps.routing.InstantAppResolverBoundService;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausg;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bqmv;
import defpackage.bqrr;
import defpackage.bqsj;
import defpackage.dowc;
import defpackage.eluo;
import defpackage.frzi;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InstantAppResolverBoundService extends BoundService {
    public static final ausn a = ausn.b("InstantAppResolver", auid.INSTANT_APPS);

    @Override // com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        bqmv a2 = bqmv.a(this);
        printWriter.println();
        printWriter.printf("\nInstant Apps enabled: %s\n", dowc.a.b());
        printWriter.printf("Instant App resolver enabled: %s\n", Boolean.valueOf(frzi.g()));
        bqsj bqsjVar = a2.c;
        printWriter.printf("Accounts: %s\n", Arrays.toString(bqsjVar.e()));
        printWriter.printf("Opt-in account: %s\n", bqsjVar.a());
        printWriter.printf("Opt-in state: %s\n", Integer.valueOf(a2.d.a()));
        try {
            printWriter.println("\nEvent Log:");
            ausg ausgVar = new ausg(a2.p);
            while (ausgVar.hasNext()) {
                printWriter.println(ausgVar.next());
            }
        } catch (ConcurrentModificationException e) {
            ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 5284)).x("Failed to dump Event log");
        }
        printWriter.println();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        if (!auub.c()) {
            return null;
        }
        if (!Objects.equals(intent.getAction(), "android.intent.action.RESOLVE_EPHEMERAL_PACKAGE") && !Objects.equals(intent.getAction(), "android.intent.action.RESOLVE_INSTANT_APP_PACKAGE")) {
            ((eluo) ((eluo) a.i()).ai((char) 5286)).B("Unexpected action: %s", intent.getAction());
            return null;
        }
        bqrr bqrrVar = new bqrr(new aupz(1, 10).submit(new Callable() { // from class: bqro
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return bqmv.a(InstantAppResolverBoundService.this);
            }
        }));
        try {
            ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class).invoke(bqrrVar, this);
            return bqrrVar.onBind(intent);
        } catch (Exception e) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 5285)).x("Failed to call attachBaseContext");
            return null;
        }
    }
}
