package com.google.android.gms.semanticlocation.subscriptions;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.SemanticLocationEventRequest;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import com.google.android.gms.semanticlocation.internal.SemanticLocationParameters;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dclx;
import defpackage.dcly;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class Subscription extends AbstractSafeParcelable implements ReflectedParcelable, dcly {
    public static final Parcelable.Creator CREATOR = new dclx();
    public final PendingIntent a;
    public final SemanticLocationParameters b;
    public final SemanticLocationEventRequest c;
    public long d;
    public final String e;
    public SemanticLocationState f;
    public long g;

    public Subscription(PendingIntent pendingIntent, SemanticLocationParameters semanticLocationParameters, SemanticLocationEventRequest semanticLocationEventRequest, long j, String str, SemanticLocationState semanticLocationState, long j2) {
        this.a = pendingIntent;
        this.b = semanticLocationParameters;
        this.c = semanticLocationEventRequest;
        this.d = j;
        this.e = str;
        this.f = semanticLocationState;
        this.g = j2;
    }

    @Override // defpackage.dcly
    public final long a() {
        return this.g;
    }

    @Override // defpackage.dcly
    public final SemanticLocationEventRequest b() {
        return this.c;
    }

    @Override // defpackage.dcly
    public final SemanticLocationState c() {
        return this.f;
    }

    @Override // defpackage.dcly
    public final SemanticLocationParameters d() {
        return this.b;
    }

    @Override // defpackage.dcly
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return atyq.b(this.a, subscription.a) && atyq.b(this.b, subscription.b) && atyq.b(this.c, subscription.c) && atyq.b(this.e, subscription.e);
    }

    @Override // defpackage.dcly
    public final boolean f() {
        return false;
    }

    public final boolean g(Account account, String str, String str2) {
        SemanticLocationParameters semanticLocationParameters = this.b;
        return atyq.b(semanticLocationParameters.a, account) && atyq.b(semanticLocationParameters.b, str) && atyq.b(semanticLocationParameters.c, str2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("request", this.c, arrayList);
        atyp.b("params", this.b, arrayList);
        atyp.b("attributionTag", this.e, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, pendingIntent, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.q(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.q(parcel, 7, this.g);
        atzr.c(parcel, a);
    }
}
