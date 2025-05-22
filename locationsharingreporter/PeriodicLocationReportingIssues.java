package com.google.android.gms.locationsharingreporter;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cdcm;
import defpackage.elhx;
import defpackage.elhz;
import defpackage.elpp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PeriodicLocationReportingIssues extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdcm();
    public final int[] a;
    public final Bundle b;
    public final boolean c;

    public PeriodicLocationReportingIssues(int[] iArr, Bundle bundle, boolean z) {
        this.a = iArr;
        this.b = bundle;
        this.c = z;
    }

    public static elhz a(int[] iArr) {
        if (iArr == null || (iArr.length) == 0) {
            return elpp.a;
        }
        elhx elhxVar = new elhx();
        for (int i : iArr) {
            elhxVar.c(Integer.valueOf(i));
        }
        return elhxVar.g();
    }

    public final String toString() {
        return "PeriodicLocationReportingIssues{generalIssues=" + Arrays.toString(this.a) + ", issuesByAccount=" + String.valueOf(this.b) + ", isCentralizedSharingFlagEnabled=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr = this.a;
        int a = atzr.a(parcel);
        atzr.p(parcel, 1, iArr, false);
        atzr.g(parcel, 2, this.b, false);
        atzr.e(parcel, 4, this.c);
        atzr.c(parcel, a);
    }
}
