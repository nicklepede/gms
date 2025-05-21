package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czgt;
import defpackage.czhf;
import defpackage.eitj;
import defpackage.ejcb;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class TimelinePath extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czhf();
    public static final List a;

    @Deprecated
    public final List b;
    public final Path c;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class SegmentPath extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new czgt();
        public final String a;
        public final Path b;

        public SegmentPath(String str, Path path) {
            this.a = str;
            this.b = path;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = arxc.a(parcel);
            arxc.v(parcel, 1, str, false);
            arxc.t(parcel, 2, this.b, i, false);
            arxc.c(parcel, a);
        }
    }

    static {
        int i = eitj.d;
        a = ejcb.a;
        Parcelable.Creator creator = Path.CREATOR;
    }

    public TimelinePath(List list, Path path) {
        this.b = list;
        this.c = path;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int a2 = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.t(parcel, 2, this.c, i, false);
        arxc.c(parcel, a2);
    }
}
