package com.google.android.gms.findmydevice.spot.localstorage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.findmydevice.spot.localstorage.DebugStateChimeraProvider;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausk;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bgda;
import defpackage.bgfw;
import defpackage.bhfh;
import defpackage.dzgp;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.eqdv;
import defpackage.eqeb;
import defpackage.eqem;
import defpackage.eqeq;
import defpackage.eqgo;
import defpackage.fqsv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DebugStateChimeraProvider extends ContentProvider {
    public static final /* synthetic */ int c = 0;
    private static final ausn d = ausn.b("DebugStateProvider", auid.FIND_MY_DEVICE_SPOT);
    public final ausk a;
    public final eqgo b;

    public DebugStateChimeraProvider(ausk auskVar, eqgo eqgoVar) {
        this.a = auskVar;
        this.b = eqgoVar;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!bhfh.b()) {
            ((eluo) ((eluo) d.h()).ai((char) 4200)).x("No Finder use case is enabled.");
            printWriter.println("No Finder use case is enabled.");
            return;
        }
        if (!fqsv.a.lK().z()) {
            if (!auub.f()) {
                ((eluo) ((eluo) d.h()).ai((char) 4194)).x("Dumping debug data isn't supported on the API level of this device.");
                printWriter.println("Dumping debug data isn't supported on the API level of this device.");
                return;
            }
            ((eluo) ((eluo) d.h()).ai((char) 4193)).x("Connecting to debug state service.");
            final Context context = getContext();
            eqem eqemVar = new eqem() { // from class: bgfo
                @Override // defpackage.eqem
                public final Object a(eqeo eqeoVar) {
                    final asvp asvpVar = new asvp();
                    final Context context2 = context;
                    AutoCloseable autoCloseable = new AutoCloseable() { // from class: bgfq
                        @Override // java.lang.AutoCloseable
                        public final void close() {
                            int i = DebugStateChimeraProvider.c;
                            aumo.a().b(context2, asvpVar);
                        }
                    };
                    DebugStateChimeraProvider debugStateChimeraProvider = DebugStateChimeraProvider.this;
                    eqgo eqgoVar = debugStateChimeraProvider.b;
                    eqeoVar.a(autoCloseable, eqgoVar);
                    ekvl.r(aumo.a().f(context2, "DebugStateProvider", (Intent) debugStateChimeraProvider.a.a(context2), asvpVar, 1, eqgoVar), "Couldn't bind to the debug state service.");
                    IBinder a = asvpVar.a();
                    if (a == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.findmydevice.spot.localstorage.aidl.IDebugStateInternalService");
                    return queryLocalInterface instanceof bgjh ? (bgjh) queryLocalInterface : new bgjf(a);
                }
            };
            eqgo eqgoVar = this.b;
            String str = (String) dzgp.a("SPOT debug state retrieval", eqeq.b(eqemVar, eqgoVar).d(new eqeb(new eqdv() { // from class: bgfs
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    final bgjh bgjhVar = (bgjh) obj;
                    return iif.a(new iic() { // from class: bgfr
                        @Override // defpackage.iic
                        public final Object a(iia iiaVar) {
                            int i = DebugStateChimeraProvider.c;
                            bgjh.this.a(new bgjd(iiaVar));
                            return "SPOT debug state";
                        }
                    });
                }
            }), eqgoVar).i());
            if (str == null) {
                str = "Error retrieving SPOT debug state.";
            }
            printWriter.println(str);
            return;
        }
        ((eluo) ((eluo) d.h()).ai((char) 4195)).x("Preparing Finder debug info.");
        try {
            printWriter.println((String) ((eqcy) ((bgfw) ((bgda) bgda.a()).H()).a()).v(3L, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            ((eluo) ((eluo) ((eluo) d.j()).s(e)).ai((char) 4198)).x("Finder debug state production interrupted.");
            printWriter.println("Finder debug state production interrupted.");
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof InterruptedException) {
                ((eluo) ((eluo) ((eluo) d.j()).s(e2)).ai((char) 4197)).x("Finder debug state production interrupted.");
                printWriter.println("Finder debug state production interrupted.");
                Thread.currentThread().interrupt();
            } else {
                Throwable cause = e2.getCause();
                Throwable th = e2;
                if (cause != null) {
                    th = e2.getCause();
                }
                ((eluo) ((eluo) ((eluo) d.i()).s(th)).ai((char) 4196)).x("Finder debug state production error.");
                printWriter.format("Error producing debug state: %s", th);
            }
        } catch (TimeoutException e3) {
            ((eluo) ((eluo) ((eluo) d.j()).s(e3)).ai((char) 4199)).x("Finder debug state production timed out.");
            printWriter.println("Finder debug state production timed out.");
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public DebugStateChimeraProvider() {
        this(new ausk() { // from class: bgfp
            @Override // defpackage.ausk
            public final Object a(Object obj) {
                int i = DebugStateChimeraProvider.c;
                Intent startIntent = BoundService.getStartIntent((Context) obj, "com.google.android.gms.findmydevice.spot.localstorage.DebugStateInternalChimeraService.BIND");
                ekvl.y(startIntent);
                return startIntent;
            }
        }, new aupz(3, 9));
    }
}
