package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cugi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class FetchBackUpDeviceContactInfoResponseEntity extends AbstractSafeParcelable implements FetchBackUpDeviceContactInfoResponse {
    public static final Parcelable.Creator CREATOR = new cugi();
    private final List a;
    private List b;

    public FetchBackUpDeviceContactInfoResponseEntity(List list) {
        this.a = list;
    }

    @Override // com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponse
    public final List a() {
        List list;
        if (this.b == null && (list = this.a) != null) {
            this.b = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.b.add((BackedUpContactsPerDevice) it.next());
            }
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FetchBackUpDeviceContactInfoResponse)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return arwb.b(a(), ((FetchBackUpDeviceContactInfoResponse) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.y(parcel, 2, a(), false);
        arxc.c(parcel, a);
    }

    public FetchBackUpDeviceContactInfoResponseEntity(List list, byte[] bArr) {
        this.b = list;
        if (list == null) {
            this.a = null;
            return;
        }
        this.a = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.add((BackedUpContactsPerDeviceEntity) ((BackedUpContactsPerDevice) it.next()));
        }
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
