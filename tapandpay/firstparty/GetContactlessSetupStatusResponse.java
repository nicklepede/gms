package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.dhie;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GetContactlessSetupStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhie();
    final ContactlessSetupItem[] a;

    public GetContactlessSetupStatusResponse(ContactlessSetupItem[] contactlessSetupItemArr) {
        this.a = contactlessSetupItemArr;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (ContactlessSetupItem contactlessSetupItem : this.a) {
            atyp.b("type", Integer.valueOf(contactlessSetupItem.a), arrayList);
            atyp.b("status", Integer.valueOf(contactlessSetupItem.b), arrayList);
        }
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.c(parcel, a);
    }
}
