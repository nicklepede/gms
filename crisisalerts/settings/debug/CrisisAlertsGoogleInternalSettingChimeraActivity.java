package com.google.android.gms.crisisalerts.settings.debug;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.crisisalerts.settings.debug.CrisisAlertsGoogleInternalSettingChimeraActivity;
import com.google.android.gms.crisisalerts.settings.debug.CrisisAlertsInjectTestAlertIntentOperation;
import defpackage.aurt;
import defpackage.azga;
import defpackage.ezkv;
import defpackage.fgub;
import defpackage.fgvn;
import defpackage.fhoq;
import defpackage.fpzr;
import defpackage.fpzt;
import defpackage.rxx;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CrisisAlertsGoogleInternalSettingChimeraActivity extends rxx {
    public static int a(fhoq fhoqVar, fhoq fhoqVar2) {
        if (!fhoqVar.c.equals(fhoqVar2.c)) {
            return fhoqVar.c.compareTo(fhoqVar2.c);
        }
        fgub fgubVar = fhoqVar.d;
        if (fgubVar == null) {
            fgubVar = fgub.a;
        }
        Instant d = fgvn.d(fgubVar);
        fgub fgubVar2 = fhoqVar2.d;
        if (fgubVar2 == null) {
            fgubVar2 = fgub.a;
        }
        return d.compareTo(fgvn.d(fgubVar2));
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        if (fpzr.f()) {
            setContentView(R.layout.crisis_alerts_google_setting_debug);
            final CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox_sound);
            final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox_vibrate);
            final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox_delay);
            CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox_override_location_check);
            CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkbox_override_throttling_check);
            TextView textView = (TextView) findViewById(R.id.shown_title);
            TextView textView2 = (TextView) findViewById(R.id.rejected_title);
            checkBox4.setChecked(((Boolean) fpzt.c.lK()).booleanValue());
            checkBox5.setChecked(((Boolean) fpzt.d.lK()).booleanValue());
            findViewById(R.id.btn_public_alert).setOnClickListener(new View.OnClickListener() { // from class: azkj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CrisisAlertsGoogleInternalSettingChimeraActivity crisisAlertsGoogleInternalSettingChimeraActivity = CrisisAlertsGoogleInternalSettingChimeraActivity.this;
                    CheckBox checkBox6 = checkBox3;
                    CrisisAlertsInjectTestAlertIntentOperation.a(crisisAlertsGoogleInternalSettingChimeraActivity, "PA", checkBox.isChecked(), checkBox2.isChecked(), checkBox6.isChecked());
                }
            });
            findViewById(R.id.btn_sos_alert).setOnClickListener(new View.OnClickListener() { // from class: azkk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CrisisAlertsGoogleInternalSettingChimeraActivity crisisAlertsGoogleInternalSettingChimeraActivity = CrisisAlertsGoogleInternalSettingChimeraActivity.this;
                    CheckBox checkBox6 = checkBox3;
                    CrisisAlertsInjectTestAlertIntentOperation.a(crisisAlertsGoogleInternalSettingChimeraActivity, "SOS", checkBox.isChecked(), checkBox2.isChecked(), checkBox6.isChecked());
                }
            });
            checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: azkl
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    aszs aszsVar = cyjh.a;
                    new cyki(CrisisAlertsGoogleInternalSettingChimeraActivity.this).br(fpzt.c.o(), String.valueOf(z));
                }
            });
            checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: azkm
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    aszs aszsVar = cyjh.a;
                    new cyki(CrisisAlertsGoogleInternalSettingChimeraActivity.this).br(fpzt.d.o(), String.valueOf(z));
                }
            });
            final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.shown_alerts);
            final LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.rejected_alerts);
            ezkv h = new azga(this, aurt.a).h();
            if (h != null) {
                textView.setText(String.format(Locale.US, "Latest Alerts Per Throttling Key: %d", Integer.valueOf(h.c.size())));
                Collection.EL.stream(h.c).sorted(new Comparator() { // from class: azkn
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        ezku ezkuVar = (ezku) obj;
                        ezku ezkuVar2 = (ezku) obj2;
                        if (ezkuVar == null || ezkuVar2 == null) {
                            return 0;
                        }
                        fhoy fhoyVar = ezkuVar.c;
                        if (fhoyVar == null) {
                            fhoyVar = fhoy.a;
                        }
                        fhoq fhoqVar = fhoyVar.c;
                        if (fhoqVar == null) {
                            fhoqVar = fhoq.a;
                        }
                        fhoy fhoyVar2 = ezkuVar2.c;
                        if (fhoyVar2 == null) {
                            fhoyVar2 = fhoy.a;
                        }
                        fhoq fhoqVar2 = fhoyVar2.c;
                        if (fhoqVar2 == null) {
                            fhoqVar2 = fhoq.a;
                        }
                        return CrisisAlertsGoogleInternalSettingChimeraActivity.a(fhoqVar, fhoqVar2);
                    }
                }).forEach(new Consumer() { // from class: azko
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void u(Object obj) {
                        ezku ezkuVar = (ezku) obj;
                        if (ezkuVar == null) {
                            return;
                        }
                        TextView textView3 = new TextView(CrisisAlertsGoogleInternalSettingChimeraActivity.this);
                        textView3.setPadding(1, 1, 2, 2);
                        textView3.setTextIsSelectable(true);
                        Locale locale = Locale.US;
                        fhoy fhoyVar = ezkuVar.c;
                        if (fhoyVar == null) {
                            fhoyVar = fhoy.a;
                        }
                        fhoq fhoqVar = fhoyVar.c;
                        if (fhoqVar == null) {
                            fhoqVar = fhoq.a;
                        }
                        String str = fhoqVar.c;
                        fhoy fhoyVar2 = ezkuVar.c;
                        if (fhoyVar2 == null) {
                            fhoyVar2 = fhoy.a;
                        }
                        fhoq fhoqVar2 = fhoyVar2.c;
                        if (fhoqVar2 == null) {
                            fhoqVar2 = fhoq.a;
                        }
                        fgub fgubVar = fhoqVar2.d;
                        if (fgubVar == null) {
                            fgubVar = fgub.a;
                        }
                        Long valueOf = Long.valueOf(fgvq.b(fgubVar));
                        fhoy fhoyVar3 = ezkuVar.c;
                        if (fhoyVar3 == null) {
                            fhoyVar3 = fhoy.a;
                        }
                        fhoq fhoqVar3 = fhoyVar3.c;
                        if (fhoqVar3 == null) {
                            fhoqVar3 = fhoq.a;
                        }
                        fgub fgubVar2 = fhoqVar3.d;
                        if (fgubVar2 == null) {
                            fgubVar2 = fgub.a;
                        }
                        Instant d = fgvn.d(fgubVar2);
                        fhoy fhoyVar4 = ezkuVar.c;
                        if (fhoyVar4 == null) {
                            fhoyVar4 = fhoy.a;
                        }
                        fhoq fhoqVar4 = fhoyVar4.c;
                        if (fhoqVar4 == null) {
                            fhoqVar4 = fhoq.a;
                        }
                        fgub fgubVar3 = fhoqVar4.d;
                        if (fgubVar3 == null) {
                            fgubVar3 = fgub.a;
                        }
                        ZonedDateTime atZone = fgvn.d(fgubVar3).atZone(ZoneId.systemDefault());
                        String str2 = ezkuVar.f;
                        fgub fgubVar4 = ezkuVar.d;
                        if (fgubVar4 == null) {
                            fgubVar4 = fgub.a;
                        }
                        Instant d2 = fgvn.d(fgubVar4);
                        fgub fgubVar5 = ezkuVar.d;
                        if (fgubVar5 == null) {
                            fgubVar5 = fgub.a;
                        }
                        ZonedDateTime atZone2 = fgvn.d(fgubVar5).atZone(ZoneId.systemDefault());
                        fhoy fhoyVar5 = ezkuVar.c;
                        if (fhoyVar5 == null) {
                            fhoyVar5 = fhoy.a;
                        }
                        fhos fhosVar = fhoyVar5.h;
                        if (fhosVar == null) {
                            fhosVar = fhos.a;
                        }
                        String str3 = fhosVar.b;
                        fhoy fhoyVar6 = ezkuVar.c;
                        if (fhoyVar6 == null) {
                            fhoyVar6 = fhoy.a;
                        }
                        fhos fhosVar2 = fhoyVar6.h;
                        if (fhosVar2 == null) {
                            fhosVar2 = fhos.a;
                        }
                        fgqi fgqiVar = fhosVar2.c;
                        if (fgqiVar == null) {
                            fgqiVar = fgqi.a;
                        }
                        LinearLayout linearLayout3 = linearLayout;
                        textView3.setText(ite.a(String.format(locale, "<i>id:<i/> {<b>%s</b>, %d[%s | %s]}<br>%s<br><i>shown:</i> %s[%s]<br><i>throttling:</i> {<b>%s</b>, %ds}<br><hr>", str, valueOf, d, atZone, str2, d2, atZone2, str3, Long.valueOf(fgvm.g(fgqiVar))), 63));
                        linearLayout3.addView(textView3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                textView2.setText(String.format(Locale.US, "Rejected: %d", Integer.valueOf(h.b.size())));
                Collection.EL.stream(h.b).sorted(new Comparator() { // from class: azkp
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        ezkw ezkwVar = (ezkw) obj;
                        ezkw ezkwVar2 = (ezkw) obj2;
                        if (ezkwVar == null || ezkwVar2 == null) {
                            return 0;
                        }
                        fhoq fhoqVar = ezkwVar.c;
                        if (fhoqVar == null) {
                            fhoqVar = fhoq.a;
                        }
                        fhoq fhoqVar2 = ezkwVar2.c;
                        if (fhoqVar2 == null) {
                            fhoqVar2 = fhoq.a;
                        }
                        return CrisisAlertsGoogleInternalSettingChimeraActivity.a(fhoqVar, fhoqVar2);
                    }
                }).forEach(new Consumer() { // from class: azkq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void u(Object obj) {
                        ezkw ezkwVar = (ezkw) obj;
                        if (ezkwVar == null) {
                            return;
                        }
                        TextView textView3 = new TextView(CrisisAlertsGoogleInternalSettingChimeraActivity.this);
                        textView3.setPadding(1, 1, 2, 2);
                        textView3.setTextIsSelectable(true);
                        Locale locale = Locale.US;
                        fhoq fhoqVar = ezkwVar.c;
                        if (fhoqVar == null) {
                            fhoqVar = fhoq.a;
                        }
                        String str = fhoqVar.c;
                        fhoq fhoqVar2 = ezkwVar.c;
                        if (fhoqVar2 == null) {
                            fhoqVar2 = fhoq.a;
                        }
                        fgub fgubVar = fhoqVar2.d;
                        if (fgubVar == null) {
                            fgubVar = fgub.a;
                        }
                        Long valueOf = Long.valueOf(fgvq.b(fgubVar));
                        fhoq fhoqVar3 = ezkwVar.c;
                        if (fhoqVar3 == null) {
                            fhoqVar3 = fhoq.a;
                        }
                        fgub fgubVar2 = fhoqVar3.d;
                        if (fgubVar2 == null) {
                            fgubVar2 = fgub.a;
                        }
                        Instant d = fgvn.d(fgubVar2);
                        fhoq fhoqVar4 = ezkwVar.c;
                        if (fhoqVar4 == null) {
                            fhoqVar4 = fhoq.a;
                        }
                        fgub fgubVar3 = fhoqVar4.d;
                        if (fgubVar3 == null) {
                            fgubVar3 = fgub.a;
                        }
                        ZonedDateTime atZone = fgvn.d(fgubVar3).atZone(ZoneId.systemDefault());
                        String str2 = ezkwVar.g;
                        Integer valueOf2 = Integer.valueOf(ezkwVar.d);
                        fgub fgubVar4 = ezkwVar.e;
                        if (fgubVar4 == null) {
                            fgubVar4 = fgub.a;
                        }
                        Instant d2 = fgvn.d(fgubVar4);
                        fgub fgubVar5 = ezkwVar.e;
                        if (fgubVar5 == null) {
                            fgubVar5 = fgub.a;
                        }
                        LinearLayout linearLayout3 = linearLayout2;
                        textView3.setText(ite.a(String.format(locale, "<i>id:</i> {<b>%s</b>, %d[%s | %s]}<br>%s<br><i>rsn:</i> <b>%d</b><br><i>r1st ej:</i> %s[%s]<br><hr>", str, valueOf, d, atZone, str2, valueOf2, d2, fgvn.d(fgubVar5).atZone(ZoneId.systemDefault())), 63));
                        linearLayout3.addView(textView3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }
}
