package com.google.android.gms.locationsharingreporter;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.catw;
import defpackage.eius;
import defpackage.eiuu;
import defpackage.ejck;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PeriodicLocationReportingIssues extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new catw();
    public final int[] a;
    public final Bundle b;
    public final boolean c;

    public PeriodicLocationReportingIssues(int[] iArr, Bundle bundle, boolean z) {
        this.a = iArr;
        this.b = bundle;
        this.c = z;
    }

    public static eiuu a(int[] iArr) {
        if (iArr == null || (iArr.length) == 0) {
            return ejck.a;
        }
        eius eiusVar = new eius();
        for (int i : iArr) {
            eiusVar.c(Integer.valueOf(i));
        }
        return eiusVar.g();
    }

    public final String toString() {
        return "PeriodicLocationReportingIssues{generalIssues=" + Arrays.toString(this.a) + ", issuesByAccount=" + String.valueOf(this.b) + ", isCentralizedSharingFlagEnabled=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr = this.a;
        int a = arxc.a(parcel);
        arxc.p(parcel, 1, iArr, false);
        arxc.g(parcel, 2, this.b, false);
        arxc.e(parcel, 4, this.c);
        arxc.c(parcel, a);
    }
}
