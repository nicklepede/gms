package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czfs;
import defpackage.czfv;
import defpackage.czgi;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class DevicePersonalizedPlaceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czfv();
    public final long a;
    public final List b;
    public final List c;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class DeviceInteractionTypeSummary extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new czfs();
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
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, i2);
            arxc.o(parcel, 2, this.b);
            arxc.H(parcel, 3, this.c);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class PersonalPlace extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new czgi();
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
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, i2);
            arxc.o(parcel, 2, this.b);
            arxc.o(parcel, 3, this.c);
            arxc.c(parcel, a);
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
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.y(parcel, 2, this.b, false);
        arxc.y(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
