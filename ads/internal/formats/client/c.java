package com.google.android.gms.ads.internal.formats.client;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.qmq;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c extends qmq implements d {
    private final Drawable a;
    private final Uri b;
    private final double c;
    private final int d;
    private final int e;

    public c(Drawable drawable, Uri uri, double d, int i, int i2) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.a = drawable;
        this.b = uri;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final double a() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final int b() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final int c() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final Uri d() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final bblp e() {
        return new ObjectWrapper(this.a);
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            bblp e = e();
            parcel2.writeNoException();
            qmr.g(parcel2, e);
        } else if (i == 2) {
            Uri uri = this.b;
            parcel2.writeNoException();
            qmr.f(parcel2, uri);
        } else if (i == 3) {
            double d = this.c;
            parcel2.writeNoException();
            parcel2.writeDouble(d);
        } else if (i == 4) {
            int i2 = this.d;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
        } else {
            if (i != 5) {
                return false;
            }
            int i3 = this.e;
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        }
        return true;
    }

    public c() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }
}
