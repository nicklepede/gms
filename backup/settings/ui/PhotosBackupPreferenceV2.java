package com.google.android.gms.backup.settings.ui;

import android.R;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.backup.settings.ui.PhotosBackupPreferenceV2;
import defpackage.ajye;
import defpackage.ajzn;
import defpackage.akaq;
import defpackage.akar;
import defpackage.akax;
import defpackage.alxv;
import defpackage.amaj;
import defpackage.amcf;
import defpackage.amcs;
import defpackage.amcu;
import defpackage.aupz;
import defpackage.caqj;
import defpackage.ekww;
import defpackage.elgo;
import defpackage.eqgo;
import defpackage.mfa;
import defpackage.ryt;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class PhotosBackupPreferenceV2 extends PhotosPreference {
    private final eqgo G;
    public final amcs a;
    public final Handler b;
    public TextView c;
    public final int d;
    public boolean e;
    public final ryt f;
    public final amcu g;
    public final amcf h;
    public final akar i;

    public PhotosBackupPreferenceV2(final Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new amcs(context, ajye.b(context), new ekww() { // from class: amco
            @Override // defpackage.ekww
            public final Object lK() {
                return ajyz.a(context);
            }
        }, new ekww() { // from class: amcp
            @Override // defpackage.ekww
            public final Object lK() {
                return ajyg.a(context);
            }
        }));
    }

    @Override // androidx.preference.Preference
    protected final void E() {
        super.V();
        this.G.execute(new Runnable() { // from class: amae
            @Override // java.lang.Runnable
            public final void run() {
                PhotosBackupPreferenceV2 photosBackupPreferenceV2 = PhotosBackupPreferenceV2.this;
                photosBackupPreferenceV2.a.d(photosBackupPreferenceV2.i);
                photosBackupPreferenceV2.e = false;
            }
        });
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        this.c = (TextView) Objects.requireNonNull((TextView) mfaVar.D(R.id.summary));
    }

    @Override // com.google.android.gms.backup.settings.ui.PhotosPreference
    public final String af() {
        amcs amcsVar = this.a;
        akax akaxVar = amcsVar.g.h() ? ((ajzn) amcsVar.g.c()).e : null;
        if (akaxVar != null) {
            return akaxVar.b;
        }
        return null;
    }

    @Override // com.google.android.gms.backup.settings.ui.BackupPreference
    public final List k(Account account) {
        String str = account == null ? null : account.name;
        final amcs amcsVar = this.a;
        final akar akarVar = this.i;
        String str2 = amcsVar.h;
        amcsVar.h = str;
        if (str2 != null && amcsVar.i != null && !Objects.equals(str2, str)) {
            amcsVar.a().execute(new Runnable() { // from class: amcm
                @Override // java.lang.Runnable
                public final void run() {
                    amcs amcsVar2 = amcs.this;
                    amcsVar2.b(amcsVar2.a.c(), akarVar);
                }
            });
        }
        return elgo.l(new amaj(this));
    }

    public PhotosBackupPreferenceV2(Context context, AttributeSet attributeSet, amcs amcsVar) {
        super(context, attributeSet);
        this.G = new aupz(1, 9);
        this.e = false;
        akaq a = akar.a();
        a.c(2);
        this.i = a.a();
        this.b = new caqj(context.getMainLooper());
        H(false);
        n(alxv.h.a(context));
        this.a = amcsVar;
        ryt rytVar = (ryt) context;
        this.f = rytVar;
        this.h = new amcf(rytVar);
        this.g = new amcu(rytVar);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true);
        this.d = typedValue.resourceId;
    }
}
