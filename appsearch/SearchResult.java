package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vzh;
import defpackage.vzq;
import defpackage.wae;
import defpackage.waf;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class SearchResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new waf();
    final GenericDocumentParcel a;
    public final List b;
    public final String c;
    public final String d;
    public final double e;
    public final List f;
    public List g;
    private vzh h;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class MatchInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new vzq();
        public final String a;
        final int b;
        final int c;
        final int d;
        final int e;
        final int f;
        final int g;
        private wae h;
        private wae i;
        private wae j;

        public MatchInfo(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = (String) Objects.requireNonNull(str);
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
        }

        public final wae a() {
            if (this.h == null) {
                this.h = new wae(this.b, this.c);
            }
            return this.h;
        }

        public final wae b() {
            if (this.j == null) {
                this.j = new wae(this.f, this.g);
            }
            return this.j;
        }

        public final wae c() {
            int i = this.d;
            if (i == -1) {
                throw new UnsupportedOperationException("Submatch is not supported with this backend/Android API level combination");
            }
            if (this.i == null) {
                this.i = new wae(i, this.e);
            }
            return this.i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = atzr.a(parcel);
            atzr.v(parcel, 1, str, false);
            atzr.o(parcel, 2, this.b);
            atzr.o(parcel, 3, this.c);
            atzr.o(parcel, 4, this.d);
            atzr.o(parcel, 5, this.e);
            atzr.o(parcel, 6, this.f);
            atzr.o(parcel, 7, this.g);
            atzr.c(parcel, a);
        }
    }

    public SearchResult(GenericDocumentParcel genericDocumentParcel, List list, String str, String str2, double d, List list2) {
        this.a = (GenericDocumentParcel) Objects.requireNonNull(genericDocumentParcel);
        this.b = (List) Objects.requireNonNull(list);
        this.c = (String) Objects.requireNonNull(str);
        this.d = (String) Objects.requireNonNull(str2);
        this.e = d;
        this.f = (List) Objects.requireNonNull(list2);
    }

    public final vzh a() {
        if (this.h == null) {
            this.h = new vzh(this.a);
        }
        return this.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.y(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.j(parcel, 5, this.e);
        atzr.y(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }
}
