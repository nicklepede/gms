package com.google.android.gms.icing.nativeindex;

import android.util.SparseIntArray;
import com.android.volley.toolbox.ImageRequest;
import defpackage.a;
import defpackage.bldw;
import defpackage.blfw;
import defpackage.blgi;
import defpackage.blgy;
import defpackage.blhb;
import defpackage.blhe;
import defpackage.blhh;
import defpackage.blia;
import defpackage.blie;
import defpackage.blir;
import defpackage.blpc;
import defpackage.eiic;
import defpackage.elcq;
import defpackage.elcs;
import defpackage.enfk;
import defpackage.enkf;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feeg;
import defpackage.feen;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
            blfw.j(e, "Native load error: %s", e.getMessage());
            z = false;
        }
        if (nativeGetVersionCode != 251661) {
            throw new UnsatisfiedLinkError(a.t(251661, nativeGetVersionCode, "Version mismatch: lib: ", " vs apk: "));
        }
        a = z;
    }

    public NativeIndex(File file, blhh blhhVar) {
        if (!file.exists()) {
            file.mkdir();
        }
        this.b = nativeCreate(B(file.getCanonicalPath()), blhhVar.r());
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
            blfw.b("getDiskUsage: %s", file.getCanonicalPath());
            return nativeGetDiskUsage(B(file.getCanonicalPath()));
        } catch (IOException e) {
            blfw.j(e, "Bad path: %s", file);
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

    public static enkf r(int i) {
        return (enkf) eiic.c(enkf.b(i), enkf.UNRECOGNIZED);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [feeg, java.lang.Object] */
    public static feeg s(byte[] bArr, feen feenVar) {
        try {
            return feenVar.j(bArr);
        } catch (fedk e) {
            blfw.j(e, "Failed to parse protobuf", new Object[0]);
            return null;
        }
    }

    public static String t(enkf enkfVar) {
        int ordinal = enkfVar.ordinal();
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
        return "error internal " + enkfVar.a();
    }

    public final boolean A(blhh blhhVar) {
        return nativeUpdateNativeConfig(this.b, blhhVar.r());
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

    public final blhe g() {
        byte[] nativeInit = nativeInit(this.b);
        if (nativeInit == null) {
            return null;
        }
        try {
            fecp y = fecp.y(blhe.a, nativeInit, 0, nativeInit.length, febw.a());
            fecp.M(y);
            return (blhe) y;
        } catch (fedk e) {
            blfw.j(e, "Failed parsing init status", new Object[0]);
            return null;
        }
    }

    public final blie h(String str, blia bliaVar, int i, int i2) {
        return (blie) s(nativeExecuteQuery(this.b, B(str), bliaVar.r(), 100000, i, i2), (feen) blie.a.iB(7, null));
    }

    public final blie i(String[] strArr, blia bliaVar) {
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = B(strArr[i]);
            i++;
            i2++;
        }
        return (blie) s(nativeGetDocuments(this.b, bArr, bliaVar.r()), (feen) blie.a.iB(7, null));
    }

    public final blir j() {
        byte[] nativeGetUsageStats = nativeGetUsageStats(this.b);
        if (nativeGetUsageStats == null) {
            return null;
        }
        try {
            fecp y = fecp.y(blir.a, nativeGetUsageStats, 0, nativeGetUsageStats.length, febw.a());
            fecp.M(y);
            return (blir) y;
        } catch (fedk e) {
            blfw.j(e, "Failed parsing usage stats", new Object[0]);
            return null;
        }
    }

    public final elcq k() {
        byte[] nativeGetCompactStatus = nativeGetCompactStatus(this.b);
        try {
            fecp y = fecp.y(elcq.a, nativeGetCompactStatus, 0, nativeGetCompactStatus.length, febw.a());
            fecp.M(y);
            return (elcq) y;
        } catch (fedk e) {
            blfw.j(e, "Failed parsing compact status", new Object[0]);
            return null;
        }
    }

    public final elcs l(double d, int i, blhb blhbVar, long[] jArr, int[] iArr, SparseIntArray sparseIntArray) {
        int[] iArr2 = new int[sparseIntArray.size()];
        int[] iArr3 = new int[sparseIntArray.size()];
        for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
            iArr2[i2] = sparseIntArray.keyAt(i2);
            iArr3[i2] = sparseIntArray.valueAt(i2);
        }
        byte[] nativeCompact = nativeCompact(this.b, d, i, blhbVar.r(), jArr, iArr, iArr2, iArr3);
        try {
            fecp y = fecp.y(elcs.a, nativeCompact, 0, nativeCompact.length, febw.a());
            fecp.M(y);
            return (elcs) y;
        } catch (fedk e) {
            blfw.j(e, "Failed parsing compaction stats", new Object[0]);
            fecj v = elcs.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((elcs) v.b).c = 18;
            return (elcs) v.Q();
        }
    }

    public final enfk m(long j, bldw bldwVar, blhb blhbVar) {
        byte[] nativeIndexDocument = nativeIndexDocument(this.b, j, bldwVar.r(), blhbVar.r());
        try {
            fecp y = fecp.y(enfk.a, nativeIndexDocument, 0, nativeIndexDocument.length, febw.a());
            fecp.M(y);
            return (enfk) y;
        } catch (fedk e) {
            blfw.j(e, "Failed to parse native index document stats.", new Object[0]);
            return null;
        }
    }

    public final enfk n(long j, byte[] bArr, blpc blpcVar, blgi blgiVar, blhb blhbVar) {
        byte[] nativeIndexThing = nativeIndexThing(this.b, j, bArr, blpcVar.r(), blgiVar.r(), blhbVar.r());
        try {
            fecp y = fecp.y(enfk.a, nativeIndexThing, 0, nativeIndexThing.length, febw.a());
            fecp.M(y);
            return (enfk) y;
        } catch (fedk e) {
            blfw.j(e, "Failed to parse native index document stats.", new Object[0]);
            return null;
        }
    }

    public final enfk o(long j, byte[] bArr, blpc blpcVar, blgi blgiVar, blhb blhbVar) {
        byte[] nativePatch = nativePatch(this.b, j, bArr, blpcVar.r(), blgiVar.r(), blhbVar.r());
        try {
            fecp y = fecp.y(enfk.a, nativePatch, 0, nativePatch.length, febw.a());
            fecp.M(y);
            return (enfk) y;
        } catch (fedk e) {
            blfw.j(e, "Failed to parse native index document stats.", new Object[0]);
            return null;
        }
    }

    public final enkf p(int i, long j) {
        return r(nativeAdvanceLastSeqno(this.b, i, j));
    }

    public final enkf q(long j, int i, String str) {
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

    public final boolean x(long j, int i, blgy blgyVar) {
        return nativeAddCorpus(this.b, j, i, blgyVar.r());
    }

    public final boolean y() {
        return nativeApplyPendingDeleteUsageReports(this.b);
    }

    public final boolean z(blhb blhbVar) {
        return nativeRebuildIndex(this.b, blhbVar.r());
    }
}
