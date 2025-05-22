package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
import defpackage.arxa;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.fktn;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class LogEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new arxa();
    private static final String[] m = new String[0];
    public PlayLoggerContext a;
    public final byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final ExperimentTokens[] g;
    public final boolean h;
    public LogVerifierResultParcelable i;
    public final int j;
    public final DataCollectionIdentifierParcelable k;
    public final fktn l;
    private final String[] n;

    public LogEventParcelable(PlayLoggerContext playLoggerContext, fktn fktnVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, ExperimentTokens[] experimentTokensArr, boolean z, String[] strArr2, int i, DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable) {
        this.a = playLoggerContext;
        this.l = fktnVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = null;
        this.g = experimentTokensArr;
        this.h = z;
        this.n = strArr2;
        this.j = i;
        this.k = dataCollectionIdentifierParcelable;
    }

    public final String[] a() {
        String[] strArr = this.n;
        return strArr == null ? m : strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogEventParcelable) {
            LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
            if (atyq.b(this.a, logEventParcelable.a) && Arrays.equals(this.b, logEventParcelable.b) && Arrays.equals(this.c, logEventParcelable.c) && Arrays.equals(this.d, logEventParcelable.d) && atyq.b(this.l, logEventParcelable.l) && Arrays.equals(this.e, logEventParcelable.e) && Arrays.deepEquals(this.f, logEventParcelable.f) && Arrays.equals(this.g, logEventParcelable.g) && Arrays.equals(this.n, logEventParcelable.n) && this.h == logEventParcelable.h && atyq.b(this.i, logEventParcelable.i) && this.j == logEventParcelable.j && atyq.b(this.k, logEventParcelable.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.l, this.e, this.f, this.g, Boolean.valueOf(this.h), this.n, this.i, Integer.valueOf(this.j), this.k});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? null : new String(bArr, StandardCharsets.UTF_8));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.l);
        sb.append(", , ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(Arrays.toString(this.n));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append(", LogVerifierResult: ");
        LogVerifierResultParcelable logVerifierResultParcelable = this.i;
        sb.append(logVerifierResultParcelable != null ? logVerifierResultParcelable.toString() : null);
        sb.append("EventCode: ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.k);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.i(parcel, 3, this.b, false);
        atzr.p(parcel, 4, this.c, false);
        atzr.w(parcel, 5, this.d, false);
        atzr.p(parcel, 6, this.e, false);
        atzr.A(parcel, 7, this.f);
        atzr.e(parcel, 8, this.h);
        atzr.J(parcel, 9, this.g, i);
        atzr.t(parcel, 11, this.i, i, false);
        atzr.w(parcel, 12, a(), false);
        atzr.o(parcel, 13, this.j);
        atzr.t(parcel, 14, this.k, i, false);
        atzr.c(parcel, a);
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr, LogVerifierResultParcelable logVerifierResultParcelable, String[] strArr2, int i, DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable) {
        this.a = playLoggerContext;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = bArr2;
        this.h = z;
        this.g = experimentTokensArr;
        this.i = logVerifierResultParcelable;
        this.n = strArr2;
        this.j = i;
        this.l = null;
        this.k = dataCollectionIdentifierParcelable;
    }
}
