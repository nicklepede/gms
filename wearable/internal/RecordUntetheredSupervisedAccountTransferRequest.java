package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkme;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class RecordUntetheredSupervisedAccountTransferRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkme();
    public final String a;
    public final String b;
    public final boolean c;

    public RecordUntetheredSupervisedAccountTransferRequest(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
