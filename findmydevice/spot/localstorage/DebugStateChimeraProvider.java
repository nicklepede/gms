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
import defpackage.asej;
import defpackage.asmf;
import defpackage.asoq;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bebo;
import defpackage.beek;
import defpackage.bfdr;
import defpackage.dwup;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.enqc;
import defpackage.enqi;
import defpackage.enqt;
import defpackage.enqx;
import defpackage.ensv;
import defpackage.fobb;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DebugStateChimeraProvider extends ContentProvider {
    public static final /* synthetic */ int c = 0;
    private static final asot d = asot.b("DebugStateProvider", asej.FIND_MY_DEVICE_SPOT);
    public final asoq a;
    public final ensv b;

    public DebugStateChimeraProvider(asoq asoqVar, ensv ensvVar) {
        this.a = asoqVar;
        this.b = ensvVar;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!bfdr.b()) {
            ((ejhf) ((ejhf) d.h()).ah((char) 4194)).x("No Finder use case is enabled.");
            printWriter.println("No Finder use case is enabled.");
            return;
        }
        if (!fobb.a.a().z()) {
            if (!asqh.f()) {
                ((ejhf) ((ejhf) d.h()).ah((char) 4188)).x("Dumping debug data isn't supported on the API level of this device.");
                printWriter.println("Dumping debug data isn't supported on the API level of this device.");
                return;
            }
            ((ejhf) ((ejhf) d.h()).ah((char) 4187)).x("Connecting to debug state service.");
            final Context context = getContext();
            enqt enqtVar = new enqt() { // from class: beec
                @Override // defpackage.enqt
                public final Object a(enqv enqvVar) {
                    final aqsz aqszVar = new aqsz();
                    final Context context2 = context;
                    AutoCloseable autoCloseable = new AutoCloseable() { // from class: beee
                        @Override // java.lang.AutoCloseable
                        public final void close() {
                            int i = DebugStateChimeraProvider.c;
                            asiu.a().b(context2, aqszVar);
                        }
                    };
                    DebugStateChimeraProvider debugStateChimeraProvider = DebugStateChimeraProvider.this;
                    ensv ensvVar = debugStateChimeraProvider.b;
                    enqvVar.a(autoCloseable, ensvVar);
                    eiig.q(asiu.a().f(context2, "DebugStateProvider", (Intent) debugStateChimeraProvider.a.a(context2), aqszVar, 1, ensvVar), "Couldn't bind to the debug state service.");
                    IBinder a = aqszVar.a();
                    if (a == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.findmydevice.spot.localstorage.aidl.IDebugStateInternalService");
                    return queryLocalInterface instanceof behv ? (behv) queryLocalInterface : new beht(a);
                }
            };
            ensv ensvVar = this.b;
            String str = (String) dwup.a("SPOT debug state retrieval", enqx.b(enqtVar, ensvVar).d(new enqi(new enqc() { // from class: beeg
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    final behv behvVar = (behv) obj;
                    return igp.a(new igm() { // from class: beef
                        @Override // defpackage.igm
                        public final Object a(igk igkVar) {
                            int i = DebugStateChimeraProvider.c;
                            behv.this.a(new behr(igkVar));
                            return "SPOT debug state";
                        }
                    });
                }
            }), ensvVar).i());
            if (str == null) {
                str = "Error retrieving SPOT debug state.";
            }
            printWriter.println(str);
            return;
        }
        ((ejhf) ((ejhf) d.h()).ah((char) 4189)).x("Preparing Finder debug info.");
        try {
            printWriter.println((String) ((enpf) ((beek) ((bebo) bebo.a()).H()).a()).v(3L, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            ((ejhf) ((ejhf) ((ejhf) d.j()).s(e)).ah((char) 4192)).x("Finder debug state production interrupted.");
            printWriter.println("Finder debug state production interrupted.");
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof InterruptedException) {
                ((ejhf) ((ejhf) ((ejhf) d.j()).s(e2)).ah((char) 4191)).x("Finder debug state production interrupted.");
                printWriter.println("Finder debug state production interrupted.");
                Thread.currentThread().interrupt();
            } else {
                Throwable cause = e2.getCause();
                Throwable th = e2;
                if (cause != null) {
                    th = e2.getCause();
                }
                ((ejhf) ((ejhf) ((ejhf) d.i()).s(th)).ah((char) 4190)).x("Finder debug state production error.");
                printWriter.format("Error producing debug state: %s", th);
            }
        } catch (TimeoutException e3) {
            ((ejhf) ((ejhf) ((ejhf) d.j()).s(e3)).ah((char) 4193)).x("Finder debug state production timed out.");
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
        this(new asoq() { // from class: beed
            @Override // defpackage.asoq
            public final Object a(Object obj) {
                int i = DebugStateChimeraProvider.c;
                Intent startIntent = BoundService.getStartIntent((Context) obj, "com.google.android.gms.findmydevice.spot.localstorage.DebugStateInternalChimeraService.BIND");
                eiig.x(startIntent);
                return startIntent;
            }
        }, new asmf(3, 9));
    }
}
