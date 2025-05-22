package com.google.android.gms.dtdi.common.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.aupz;
import defpackage.dvww;
import defpackage.dwix;
import defpackage.dwjl;
import defpackage.dwud;
import defpackage.fxxm;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GoogleAccountAvatar extends FrameLayout {
    public final AccountParticleDisc a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleAccountAvatar(Context context) {
        this(context, null, 0, null, 14, null);
        fxxm.f(context, "context");
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        addView(this.a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleAccountAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleAccountAvatar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAccountAvatar(Context context, AttributeSet attributeSet, int i, ExecutorService executorService) {
        super(context, attributeSet, i);
        fxxm.f(context, "context");
        AccountParticleDisc accountParticleDisc = new AccountParticleDisc(context, attributeSet, i);
        this.a = accountParticleDisc;
        dwix dwixVar = new dwix();
        executorService = executorService == null ? new aupz(1, 9) : executorService;
        Context applicationContext = context.getApplicationContext();
        dwud dwudVar = new dwud();
        dwudVar.a = executorService;
        accountParticleDisc.i(new dvww(context.getApplicationContext(), executorService, dwixVar, new dwjl(applicationContext, dwudVar.a())), dwixVar);
    }

    public /* synthetic */ GoogleAccountAvatar(Context context, AttributeSet attributeSet, int i, ExecutorService executorService, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : executorService);
    }
}
