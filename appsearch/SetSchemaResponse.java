package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bsa;
import defpackage.uct;
import defpackage.uds;
import defpackage.ues;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class SetSchemaResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ues();
    final List a;
    final List b;
    final List c;
    private final List d;
    private Set e;
    private Set f;
    private Set g;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class MigrationFailure extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new uds();
        public final String a;
        public final String b;
        public final String c;
        final String d;
        final int e;

        public MigrationFailure(String str, String str2, String str3, String str4, int i) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
        }

        public final uct a() {
            return new uct(this.e, null, this.d);
        }

        public final String toString() {
            return "MigrationFailure { schemaType: " + this.c + ", namespace: " + this.a + ", documentId: " + this.b + ", appSearchResult: " + a().toString() + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = arxc.a(parcel);
            arxc.v(parcel, 1, str, false);
            arxc.v(parcel, 2, this.b, false);
            arxc.v(parcel, 3, this.c, false);
            arxc.v(parcel, 4, this.d, false);
            arxc.o(parcel, 5, this.e);
            arxc.c(parcel, a);
        }
    }

    public SetSchemaResponse(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = Collections.EMPTY_LIST;
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.d);
    }

    public final Set b() {
        if (this.e == null) {
            this.e = new bsa((Collection) Objects.requireNonNull(this.a));
        }
        return DesugarCollections.unmodifiableSet(this.e);
    }

    public final Set c() {
        if (this.g == null) {
            this.g = new bsa((Collection) Objects.requireNonNull(this.b));
        }
        return DesugarCollections.unmodifiableSet(this.g);
    }

    public final Set d() {
        if (this.f == null) {
            this.f = new bsa((Collection) Objects.requireNonNull(this.c));
        }
        return DesugarCollections.unmodifiableSet(this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.x(parcel, 1, list, false);
        arxc.x(parcel, 2, this.b, false);
        arxc.x(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public SetSchemaResponse(List list, List list2, List list3, List list4) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = (List) Objects.requireNonNull(list4);
    }
}
