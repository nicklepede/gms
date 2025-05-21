package com.google.android.gms.backup.settings.ui;

import android.R;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.backup.settings.ui.PhotosBackupPreferenceV2;
import defpackage.ahxo;
import defpackage.ahyx;
import defpackage.aiaa;
import defpackage.aiab;
import defpackage.aiah;
import defpackage.ajwx;
import defpackage.ajzl;
import defpackage.akbh;
import defpackage.akbu;
import defpackage.akbw;
import defpackage.asmf;
import defpackage.byhr;
import defpackage.eijr;
import defpackage.eitj;
import defpackage.ensv;
import defpackage.kmp;
import defpackage.qfp;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PhotosBackupPreferenceV2 extends PhotosPreference {
    private final ensv G;
    public final akbu a;
    public final Handler b;
    public TextView c;
    public final int d;
    public boolean e;
    public final qfp f;
    public final akbw g;
    public final akbh h;
    public final aiab i;

    public PhotosBackupPreferenceV2(final Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new akbu(context, ahxo.b(context), new eijr() { // from class: akbq
            @Override // defpackage.eijr
            public final Object a() {
                return ahyj.a(context);
            }
        }, new eijr() { // from class: akbr
            @Override // defpackage.eijr
            public final Object a() {
                return ahxq.a(context);
            }
        }));
    }

    @Override // androidx.preference.Preference
    protected final void E() {
        super.V();
        this.G.execute(new Runnable() { // from class: ajzg
            @Override // java.lang.Runnable
            public final void run() {
                PhotosBackupPreferenceV2 photosBackupPreferenceV2 = PhotosBackupPreferenceV2.this;
                photosBackupPreferenceV2.a.d(photosBackupPreferenceV2.i);
                photosBackupPreferenceV2.e = false;
            }
        });
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        this.c = (TextView) Objects.requireNonNull((TextView) kmpVar.D(R.id.summary));
    }

    @Override // com.google.android.gms.backup.settings.ui.PhotosPreference
    public final String af() {
        akbu akbuVar = this.a;
        aiah aiahVar = akbuVar.g.h() ? ((ahyx) akbuVar.g.c()).e : null;
        if (aiahVar != null) {
            return aiahVar.b;
        }
        return null;
    }

    @Override // com.google.android.gms.backup.settings.ui.BackupPreference
    public final List k(Account account) {
        String str = account == null ? null : account.name;
        final akbu akbuVar = this.a;
        final aiab aiabVar = this.i;
        String str2 = akbuVar.h;
        akbuVar.h = str;
        if (str2 != null && akbuVar.i != null && !Objects.equals(str2, str)) {
            akbuVar.a().execute(new Runnable() { // from class: akbo
                @Override // java.lang.Runnable
                public final void run() {
                    akbu akbuVar2 = akbu.this;
                    akbuVar2.b(akbuVar2.a.c(), aiabVar);
                }
            });
        }
        return eitj.l(new ajzl(this));
    }

    public PhotosBackupPreferenceV2(Context context, AttributeSet attributeSet, akbu akbuVar) {
        super(context, attributeSet);
        this.G = new asmf(1, 9);
        this.e = false;
        aiaa a = aiab.a();
        a.c(2);
        this.i = a.a();
        this.b = new byhr(context.getMainLooper());
        H(false);
        n(ajwx.h.a(context));
        this.a = akbuVar;
        qfp qfpVar = (qfp) context;
        this.f = qfpVar;
        this.h = new akbh(qfpVar);
        this.g = new akbw(qfpVar);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true);
        this.d = typedValue.resourceId;
    }
}
