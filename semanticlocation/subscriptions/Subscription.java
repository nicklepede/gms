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
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dabp;
import defpackage.dabq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class Subscription extends AbstractSafeParcelable implements ReflectedParcelable, dabq {
    public static final Parcelable.Creator CREATOR = new dabp();
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

    @Override // defpackage.dabq
    public final long a() {
        return this.g;
    }

    @Override // defpackage.dabq
    public final SemanticLocationEventRequest b() {
        return this.c;
    }

    @Override // defpackage.dabq
    public final SemanticLocationState c() {
        return this.f;
    }

    @Override // defpackage.dabq
    public final SemanticLocationParameters d() {
        return this.b;
    }

    @Override // defpackage.dabq
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
        return arwb.b(this.a, subscription.a) && arwb.b(this.b, subscription.b) && arwb.b(this.c, subscription.c) && arwb.b(this.e, subscription.e);
    }

    @Override // defpackage.dabq
    public final boolean f() {
        return false;
    }

    public final boolean g(Account account, String str, String str2) {
        SemanticLocationParameters semanticLocationParameters = this.b;
        return arwb.b(semanticLocationParameters.a, account) && arwb.b(semanticLocationParameters.b, str) && arwb.b(semanticLocationParameters.c, str2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("request", this.c, arrayList);
        arwa.b("params", this.b, arrayList);
        arwa.b("attributionTag", this.e, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, pendingIntent, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.q(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.q(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}
