package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.dexa;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GetContactlessSetupStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dexa();
    final ContactlessSetupItem[] a;

    public GetContactlessSetupStatusResponse(ContactlessSetupItem[] contactlessSetupItemArr) {
        this.a = contactlessSetupItemArr;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (ContactlessSetupItem contactlessSetupItem : this.a) {
            arwa.b("type", Integer.valueOf(contactlessSetupItem.a), arrayList);
            arwa.b("status", Integer.valueOf(contactlessSetupItem.b), arrayList);
        }
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.c(parcel, a);
    }
}
