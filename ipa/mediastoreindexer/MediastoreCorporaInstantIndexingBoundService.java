package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import android.database.Cursor;
import android.os.IBinder;
import android.provider.MediaStore;
import com.google.android.chimera.BoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bopm;
import defpackage.borw;
import defpackage.borx;
import defpackage.bory;
import defpackage.boso;
import defpackage.bosp;
import defpackage.fpgv;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class MediastoreCorporaInstantIndexingBoundService extends BoundService {
    public static final asot a = asot.b("GmscoreIpa", asej.PLATFORM_DATA_INDEXER);

    @Override // com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!fpgv.o()) {
            printWriter.println("Mediastore indexer not enabled.");
            return;
        }
        printWriter.println("Media store indexer:");
        printWriter.format("DB version: %d\n", 3);
        bory boryVar = new bory(getContentResolver(), null);
        borw borwVar = new borw();
        borwVar.f = 1;
        borwVar.a = 0L;
        borwVar.c = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        borwVar.d = new String[]{"_id"};
        Cursor a2 = boryVar.a(new borx(borwVar));
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
        Cursor b = new boso(bosp.c(this)).b();
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

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        if (!fpgv.o() || fpgv.m()) {
            return;
        }
        bopm.b(getApplicationContext());
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        bopm.c(getApplicationContext());
    }
}
