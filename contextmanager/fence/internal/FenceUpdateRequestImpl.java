package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.atpn;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FenceUpdateRequestImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atpn();
    public final ArrayList a;

    public FenceUpdateRequestImpl(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 2, arrayList, false);
        arxc.c(parcel, a);
    }
}
