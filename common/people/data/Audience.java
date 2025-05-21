package com.google.android.gms.common.people.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.asca;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class Audience extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new asca();
    public final int a;
    public final List b;
    public final int c;

    @Deprecated
    public final boolean d;
    public final boolean e;

    public Audience(List list) {
        this.a = 2;
        this.b = list;
        this.c = 0;
        this.e = false;
        this.d = true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Audience)) {
            return false;
        }
        Audience audience = (Audience) obj;
        return this.a == audience.a && arwb.b(this.b, audience.b) && this.c == audience.c && this.e == audience.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), Boolean.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.o(parcel, 2, this.c);
        arxc.e(parcel, 3, this.d);
        arxc.e(parcel, 4, this.e);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        arxc.c(parcel, a);
    }

    public Audience(int i, List list, int i2, boolean z, boolean z2) {
        List unmodifiableList;
        if (i == 1) {
            list = list == null ? Collections.EMPTY_LIST : list;
            i = 1;
        }
        this.a = i;
        if (i2 == 1) {
            ArrayList arrayList = new ArrayList();
            for (AudienceMember audienceMember : list) {
                if (audienceMember.b != 1 || audienceMember.c != 1) {
                    arrayList.add(audienceMember);
                }
            }
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        this.b = unmodifiableList;
        this.c = i2;
        if (i == 1) {
            this.d = z;
            this.e = !z;
        } else {
            this.e = z2;
            this.d = !z2;
        }
    }
}
