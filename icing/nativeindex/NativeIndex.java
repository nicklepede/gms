package com.google.android.gms.icing.nativeindex;

import android.util.SparseIntArray;
import com.android.volley.toolbox.ImageRequest;
import defpackage.a;
import defpackage.bnko;
import defpackage.bnmo;
import defpackage.bnna;
import defpackage.bnnq;
import defpackage.bnnt;
import defpackage.bnnw;
import defpackage.bnnz;
import defpackage.bnos;
import defpackage.bnow;
import defpackage.bnpj;
import defpackage.bnvu;
import defpackage.ekvh;
import defpackage.enqd;
import defpackage.enqf;
import defpackage.eptb;
import defpackage.epxw;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgsz;
import defpackage.fgtg;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class NativeIndex {
    public static final boolean a;
    public long b;

    static {
        int nativeGetVersionCode;
        boolean z = true;
        try {
            System.loadLibrary("AppDataSearch");
            nativeGetVersionCode = nativeGetVersionCode() / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        } catch (LinkageError e) {
            bnmo.j(e, "Native load error: %s", e.getMessage());
            z = false;
        }
        if (nativeGetVersionCode != 251864) {
            throw new UnsatisfiedLinkError(a.t(251864, nativeGetVersionCode, "Version mismatch: lib: ", " vs apk: "));
        }
        a = z;
    }

    public NativeIndex(File file, bnnz bnnzVar) {
        if (!file.exists()) {
            file.mkdir();
        }
        this.b = nativeCreate(B(file.getCanonicalPath()), bnnzVar.r());
    }

    public static byte[] B(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new UnsupportedOperationException("UTF-8 not supported");
        }
    }

    public static int b(double d) {
        return Math.max((int) Math.round(d * 255.0d), 1);
    }

    public static long e(File file) {
        if (!a) {
            return -1L;
        }
        try {
            bnmo.b("getDiskUsage: %s", file.getCanonicalPath());
            return nativeGetDiskUsage(B(file.getCanonicalPath()));
        } catch (IOException e) {
            bnmo.j(e, "Bad path: %s", file);
            return -1L;
        }
    }

    private static native boolean nativeAddCorpus(long j, long j2, int i, byte[] bArr);

    private static native void nativeAddPendingDeleteUsageReport(long j, long j2, byte[] bArr, int i, int i2);

    public static native boolean nativeAddUsageReport(long j, byte[] bArr);

    private static native int nativeAdvanceLastSeqno(long j, int i, long j2);

    private static native boolean nativeApplyPendingDeleteUsageReports(long j);

    public static native boolean nativeClear(long j);

    public static native boolean nativeClearUsageReportData(long j);

    public static native boolean nativeClearUsageReportDataForIdAndUri(long j, long j2, byte[] bArr);

    private static native void nativeCommit(long j);

    private static native byte[] nativeCompact(long j, double d, int i, byte[] bArr, long[] jArr, int[] iArr, int[] iArr2, int[] iArr3);

    public static native boolean nativeCopyIndexToDirectory(long j, String str, byte[] bArr);

    private static native long nativeCreate(byte[] bArr, byte[] bArr2);

    public static native boolean nativeDeleteCorpus(long j, int i);

    private static native int nativeDeleteDocument(long j, long j2, int i, byte[] bArr);

    private static native void nativeDestroy(long j);

    private static native byte[] nativeExecuteQuery(long j, byte[] bArr, byte[] bArr2, int i, int i2, int i3);

    public static native void nativeFlush(long j);

    private static native byte[] nativeGetCompactStatus(long j);

    public static native long nativeGetCorpusDocumentsSize(long j, int i);

    public static native byte[] nativeGetDebugInfo(long j, int i);

    private static native long nativeGetDiskUsage(byte[] bArr);

    private static native byte[] nativeGetDocuments(long j, byte[][] bArr, byte[] bArr2);

    private static native long nativeGetLastSeqno(long j, int i, boolean z);

    public static native int[] nativeGetPhraseAffinityScores(long j, byte[] bArr);

    public static native byte[] nativeGetStatus(long j, boolean z);

    public static native byte[] nativeGetStorageState(long j);

    private static native byte[] nativeGetUsageStats(long j);

    private static native int nativeGetVersionCode();

    private static native byte[] nativeIndexDocument(long j, long j2, byte[] bArr, byte[] bArr2);

    private static native byte[] nativeIndexThing(long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    private static native byte[] nativeInit(long j);

    private static native double nativeMinFreeFraction(long j);

    private static native int nativeNumDocuments(long j);

    private static native int nativeNumPostingLists(long j);

    public static native void nativeOnMaintenance(long j, boolean z);

    public static native void nativeOnSleep(long j);

    private static native byte[] nativePatch(long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    private static native boolean nativeRebuildIndex(long j, byte[] bArr);

    public static native byte[] nativeRestoreIndex(long j, byte[] bArr);

    public static native byte[] nativeSuggest(long j, byte[] bArr, int[] iArr, int i);

    public static native int nativeTagDocument(long j, long j2, int i, byte[] bArr, byte[] bArr2, int i2, boolean z);

    private static native boolean nativeUpdateNativeConfig(long j, byte[] bArr);

    public static native boolean nativeUpgrade(long j, int i, int i2);

    public static epxw r(int i) {
        return (epxw) ekvh.c(epxw.b(i), epxw.UNRECOGNIZED);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [fgsz, java.lang.Object] */
    public static fgsz s(byte[] bArr, fgtg fgtgVar) {
        try {
            return fgtgVar.j(bArr);
        } catch (fgsd e) {
            bnmo.j(e, "Failed to parse protobuf", new Object[0]);
            return null;
        }
    }

    public static String t(epxw epxwVar) {
        int ordinal = epxwVar.ordinal();
        if (ordinal == 0) {
            return "ok";
        }
        if (ordinal == 1 || ordinal == 2) {
            return "ok trimmed";
        }
        if (ordinal == 3) {
            return "ok duplicate uri replaced";
        }
        if (ordinal == 4) {
            return "ok modified";
        }
        if (ordinal == 6) {
            return "error uri not found";
        }
        if (ordinal == 7) {
            return "error i/o";
        }
        return "error internal " + epxwVar.a();
    }

    public final boolean A(bnnz bnnzVar) {
        return nativeUpdateNativeConfig(this.b, bnnzVar.r());
    }

    public final double a() {
        return nativeMinFreeFraction(this.b);
    }

    public final int c() {
        return nativeNumDocuments(this.b);
    }

    public final int d() {
        return nativeNumPostingLists(this.b);
    }

    public final long f(int i, boolean z) {
        return nativeGetLastSeqno(this.b, i, z);
    }

    public final void finalize() {
        w();
        super.finalize();
    }

    public final bnnw g() {
        byte[] nativeInit = nativeInit(this.b);
        if (nativeInit == null) {
            return null;
        }
        try {
            fgri y = fgri.y(bnnw.a, nativeInit, 0, nativeInit.length, fgqp.a());
            fgri.M(y);
            return (bnnw) y;
        } catch (fgsd e) {
            bnmo.j(e, "Failed parsing init status", new Object[0]);
            return null;
        }
    }

    public final bnow h(String str, bnos bnosVar, int i, int i2) {
        return (bnow) s(nativeExecuteQuery(this.b, B(str), bnosVar.r(), 100000, i, i2), (fgtg) bnow.a.iQ(7, null));
    }

    public final bnow i(String[] strArr, bnos bnosVar) {
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = B(strArr[i]);
            i++;
            i2++;
        }
        return (bnow) s(nativeGetDocuments(this.b, bArr, bnosVar.r()), (fgtg) bnow.a.iQ(7, null));
    }

    public final bnpj j() {
        byte[] nativeGetUsageStats = nativeGetUsageStats(this.b);
        if (nativeGetUsageStats == null) {
            return null;
        }
        try {
            fgri y = fgri.y(bnpj.a, nativeGetUsageStats, 0, nativeGetUsageStats.length, fgqp.a());
            fgri.M(y);
            return (bnpj) y;
        } catch (fgsd e) {
            bnmo.j(e, "Failed parsing usage stats", new Object[0]);
            return null;
        }
    }

    public final enqd k() {
        byte[] nativeGetCompactStatus = nativeGetCompactStatus(this.b);
        try {
            fgri y = fgri.y(enqd.a, nativeGetCompactStatus, 0, nativeGetCompactStatus.length, fgqp.a());
            fgri.M(y);
            return (enqd) y;
        } catch (fgsd e) {
            bnmo.j(e, "Failed parsing compact status", new Object[0]);
            return null;
        }
    }

    public final enqf l(double d, int i, bnnt bnntVar, long[] jArr, int[] iArr, SparseIntArray sparseIntArray) {
        int[] iArr2 = new int[sparseIntArray.size()];
        int[] iArr3 = new int[sparseIntArray.size()];
        for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
            iArr2[i2] = sparseIntArray.keyAt(i2);
            iArr3[i2] = sparseIntArray.valueAt(i2);
        }
        byte[] nativeCompact = nativeCompact(this.b, d, i, bnntVar.r(), jArr, iArr, iArr2, iArr3);
        try {
            fgri y = fgri.y(enqf.a, nativeCompact, 0, nativeCompact.length, fgqp.a());
            fgri.M(y);
            return (enqf) y;
        } catch (fgsd e) {
            bnmo.j(e, "Failed parsing compaction stats", new Object[0]);
            fgrc v = enqf.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((enqf) v.b).c = 18;
            return (enqf) v.Q();
        }
    }

    public final eptb m(long j, bnko bnkoVar, bnnt bnntVar) {
        byte[] nativeIndexDocument = nativeIndexDocument(this.b, j, bnkoVar.r(), bnntVar.r());
        try {
            fgri y = fgri.y(eptb.a, nativeIndexDocument, 0, nativeIndexDocument.length, fgqp.a());
            fgri.M(y);
            return (eptb) y;
        } catch (fgsd e) {
            bnmo.j(e, "Failed to parse native index document stats.", new Object[0]);
            return null;
        }
    }

    public final eptb n(long j, byte[] bArr, bnvu bnvuVar, bnna bnnaVar, bnnt bnntVar) {
        byte[] nativeIndexThing = nativeIndexThing(this.b, j, bArr, bnvuVar.r(), bnnaVar.r(), bnntVar.r());
        try {
            fgri y = fgri.y(eptb.a, nativeIndexThing, 0, nativeIndexThing.length, fgqp.a());
            fgri.M(y);
            return (eptb) y;
        } catch (fgsd e) {
            bnmo.j(e, "Failed to parse native index document stats.", new Object[0]);
            return null;
        }
    }

    public final eptb o(long j, byte[] bArr, bnvu bnvuVar, bnna bnnaVar, bnnt bnntVar) {
        byte[] nativePatch = nativePatch(this.b, j, bArr, bnvuVar.r(), bnnaVar.r(), bnntVar.r());
        try {
            fgri y = fgri.y(eptb.a, nativePatch, 0, nativePatch.length, fgqp.a());
            fgri.M(y);
            return (eptb) y;
        } catch (fgsd e) {
            bnmo.j(e, "Failed to parse native index document stats.", new Object[0]);
            return null;
        }
    }

    public final epxw p(int i, long j) {
        return r(nativeAdvanceLastSeqno(this.b, i, j));
    }

    public final epxw q(long j, int i, String str) {
        return r(nativeDeleteDocument(this.b, j, i, B(str)));
    }

    public final void u(long j, int i, int i2) {
        nativeAddPendingDeleteUsageReport(this.b, j, B(""), i, i2);
    }

    public final void v() {
        nativeCommit(this.b);
    }

    public final void w() {
        long j = this.b;
        if (j != 0) {
            nativeDestroy(j);
        }
        this.b = 0L;
    }

    public final boolean x(long j, int i, bnnq bnnqVar) {
        return nativeAddCorpus(this.b, j, i, bnnqVar.r());
    }

    public final boolean y() {
        return nativeApplyPendingDeleteUsageReports(this.b);
    }

    public final boolean z(bnnt bnntVar) {
        return nativeRebuildIndex(this.b, bnntVar.r());
    }
}
