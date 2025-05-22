package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import android.database.Cursor;
import android.os.IBinder;
import android.provider.MediaStore;
import com.google.android.chimera.BoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bqxc;
import defpackage.bqzm;
import defpackage.bqzn;
import defpackage.bqzo;
import defpackage.brae;
import defpackage.braf;
import defpackage.fsah;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class MediastoreCorporaInstantIndexingBoundService extends BoundService {
    public static final ausn a = ausn.b("GmscoreIpa", auid.PLATFORM_DATA_INDEXER);

    @Override // com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!fsah.o()) {
            printWriter.println("Mediastore indexer not enabled.");
            return;
        }
        printWriter.println("Media store indexer:");
        printWriter.format("DB version: %d\n", 3);
        bqzo bqzoVar = new bqzo(getContentResolver(), null);
        bqzm bqzmVar = new bqzm();
        bqzmVar.f = 1;
        bqzmVar.a = 0L;
        bqzmVar.c = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        bqzmVar.d = new String[]{"_id"};
        Cursor a2 = bqzoVar.a(new bqzn(bqzmVar));
        if (a2 != null) {
            try {
                printWriter.format("Image media source size: %d\n", Integer.valueOf(a2.getCount()));
            } catch (Throwable th) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (a2 != null) {
            a2.close();
        }
        Cursor b = new brae(braf.c(this)).b();
        try {
            printWriter.format("Intermediate store size: %d\n", Integer.valueOf(b.getCount()));
            if (b != null) {
                b.close();
            }
        } catch (Throwable th3) {
            if (b != null) {
                try {
                    b.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        if (!fsah.o() || fsah.m()) {
            return;
        }
        bqxc.b(getApplicationContext());
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        bqxc.c(getApplicationContext());
    }
}
