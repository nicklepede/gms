package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbqr;
import defpackage.dbrd;
import defpackage.elgo;
import defpackage.elpg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TimelinePath extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbrd();
    public static final List a;

    @Deprecated
    public final List b;
    public final Path c;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class SegmentPath extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dbqr();
        public final String a;
        public final Path b;

        public SegmentPath(String str, Path path) {
            this.a = str;
            this.b = path;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = atzr.a(parcel);
            atzr.v(parcel, 1, str, false);
            atzr.t(parcel, 2, this.b, i, false);
            atzr.c(parcel, a);
        }
    }

    static {
        int i = elgo.d;
        a = elpg.a;
        Parcelable.Creator creator = Path.CREATOR;
    }

    public TimelinePath(List list, Path path) {
        this.b = list;
        this.c = path;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int a2 = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.t(parcel, 2, this.c, i, false);
        atzr.c(parcel, a2);
    }
}
