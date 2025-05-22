package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bosw;
import defpackage.bosy;
import defpackage.fxxm;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ClearRegistryRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bosw();
    public final boolean a;
    public final ClearTypedRegistryOption b;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class ClearTypedRegistryOption extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new bosy();
        public final boolean a;
        public final String b;
        public final boolean c;
        public final List d;

        public ClearTypedRegistryOption(boolean z, String str, boolean z2, List list) {
            fxxm.f(str, "type");
            fxxm.f(list, "registryIds");
            this.a = z;
            this.b = str;
            this.c = z2;
            this.d = list;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            fxxm.f(parcel, "dest");
            boolean z = this.a;
            int a = atzr.a(parcel);
            atzr.e(parcel, 1, z);
            atzr.v(parcel, 2, this.b, false);
            atzr.e(parcel, 3, this.c);
            atzr.x(parcel, 4, this.d, false);
            atzr.c(parcel, a);
        }
    }

    public ClearRegistryRequest(boolean z, ClearTypedRegistryOption clearTypedRegistryOption) {
        this.a = z;
        this.b = clearTypedRegistryOption;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public ClearRegistryRequest() {
        this(true, null);
    }
}
