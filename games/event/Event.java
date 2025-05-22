package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import defpackage.atqs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public interface Event extends Parcelable, atqs {
    long a();

    Uri b();

    Player c();

    String d();

    String e();

    String f();

    String g();

    @Deprecated
    String getIconImageUrl();

    boolean h();
}
