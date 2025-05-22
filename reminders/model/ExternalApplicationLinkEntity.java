package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.czof;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ExternalApplicationLinkEntity extends AbstractSafeParcelable implements ExternalApplicationLink {
    public static final Parcelable.Creator CREATOR = new czof();
    public final Integer a;
    public final String b;

    public ExternalApplicationLinkEntity(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public static int b(ExternalApplicationLink externalApplicationLink) {
        return Arrays.hashCode(new Object[]{externalApplicationLink.a(), externalApplicationLink.c()});
    }

    public static boolean d(ExternalApplicationLink externalApplicationLink, ExternalApplicationLink externalApplicationLink2) {
        return atyq.b(externalApplicationLink.a(), externalApplicationLink2.a()) && atyq.b(externalApplicationLink.c(), externalApplicationLink2.c());
    }

    @Override // com.google.android.gms.reminders.model.ExternalApplicationLink
    public final Integer a() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.ExternalApplicationLink
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExternalApplicationLink)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d(this, (ExternalApplicationLink) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czof.a(this, parcel);
    }

    public ExternalApplicationLinkEntity(ExternalApplicationLink externalApplicationLink) {
        this(externalApplicationLink.a(), externalApplicationLink.c());
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
