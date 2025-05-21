package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import defpackage.arod;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public interface Event extends Parcelable, arod {
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
