package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbpq;
import defpackage.dbpt;
import defpackage.dbqg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class DevicePersonalizedPlaceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbpt();
    public final long a;
    public final List b;
    public final List c;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class DeviceInteractionTypeSummary extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dbpq();
        public final int a;
        public final int b;
        public final List c;

        public DeviceInteractionTypeSummary(int i, int i2, List list) {
            this.a = i;
            this.b = i2;
            this.c = list;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = atzr.a(parcel);
            atzr.o(parcel, 1, i2);
            atzr.o(parcel, 2, this.b);
            atzr.H(parcel, 3, this.c);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class PersonalPlace extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dbqg();
        public final int a;
        public final int b;
        public final int c;

        public PersonalPlace(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = atzr.a(parcel);
            atzr.o(parcel, 1, i2);
            atzr.o(parcel, 2, this.b);
            atzr.o(parcel, 3, this.c);
            atzr.c(parcel, a);
        }
    }

    public DevicePersonalizedPlaceInfo(long j, List list, List list2) {
        this.a = j;
        this.b = list;
        this.c = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.y(parcel, 2, this.b, false);
        atzr.y(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
