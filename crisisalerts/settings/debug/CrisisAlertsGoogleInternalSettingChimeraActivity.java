package com.google.android.gms.crisisalerts.settings.debug;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.crisisalerts.settings.debug.CrisisAlertsGoogleInternalSettingChimeraActivity;
import com.google.android.gms.crisisalerts.settings.debug.CrisisAlertsInjectTestAlertIntentOperation;
import defpackage.asnz;
import defpackage.axca;
import defpackage.ewwm;
import defpackage.fefi;
import defpackage.fegu;
import defpackage.fezs;
import defpackage.fnhq;
import defpackage.fnhs;
import defpackage.qet;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CrisisAlertsGoogleInternalSettingChimeraActivity extends qet {
    public static int a(fezs fezsVar, fezs fezsVar2) {
        if (!fezsVar.c.equals(fezsVar2.c)) {
            return fezsVar.c.compareTo(fezsVar2.c);
        }
        fefi fefiVar = fezsVar.d;
        if (fefiVar == null) {
            fefiVar = fefi.a;
        }
        Instant d = fegu.d(fefiVar);
        fefi fefiVar2 = fezsVar2.d;
        if (fefiVar2 == null) {
            fefiVar2 = fefi.a;
        }
        return d.compareTo(fegu.d(fefiVar2));
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        if (fnhq.f()) {
            setContentView(R.layout.crisis_alerts_google_setting_debug);
            final CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox_sound);
            final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox_vibrate);
            final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox_delay);
            CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox_override_location_check);
            CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkbox_override_throttling_check);
            TextView textView = (TextView) findViewById(R.id.shown_title);
            TextView textView2 = (TextView) findViewById(R.id.rejected_title);
            checkBox4.setChecked(((Boolean) fnhs.c.a()).booleanValue());
            checkBox5.setChecked(((Boolean) fnhs.d.a()).booleanValue());
            findViewById(R.id.btn_public_alert).setOnClickListener(new View.OnClickListener() { // from class: axgj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CrisisAlertsGoogleInternalSettingChimeraActivity crisisAlertsGoogleInternalSettingChimeraActivity = CrisisAlertsGoogleInternalSettingChimeraActivity.this;
                    CheckBox checkBox6 = checkBox3;
                    CrisisAlertsInjectTestAlertIntentOperation.a(crisisAlertsGoogleInternalSettingChimeraActivity, "PA", checkBox.isChecked(), checkBox2.isChecked(), checkBox6.isChecked());
                }
            });
            findViewById(R.id.btn_sos_alert).setOnClickListener(new View.OnClickListener() { // from class: axgk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CrisisAlertsGoogleInternalSettingChimeraActivity crisisAlertsGoogleInternalSettingChimeraActivity = CrisisAlertsGoogleInternalSettingChimeraActivity.this;
                    CheckBox checkBox6 = checkBox3;
                    CrisisAlertsInjectTestAlertIntentOperation.a(crisisAlertsGoogleInternalSettingChimeraActivity, "SOS", checkBox.isChecked(), checkBox2.isChecked(), checkBox6.isChecked());
                }
            });
            checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: axgl
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    aqxd aqxdVar = cvzk.a;
                    new cwal(CrisisAlertsGoogleInternalSettingChimeraActivity.this).bt(fnhs.c.a, String.valueOf(z));
                }
            });
            checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: axgm
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    aqxd aqxdVar = cvzk.a;
                    new cwal(CrisisAlertsGoogleInternalSettingChimeraActivity.this).bt(fnhs.d.a, String.valueOf(z));
                }
            });
            final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.shown_alerts);
            final LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.rejected_alerts);
            ewwm h = new axca(this, asnz.a).h();
            if (h != null) {
                textView.setText(String.format(Locale.US, "Latest Alerts Per Throttling Key: %d", Integer.valueOf(h.c.size())));
                Collection.EL.stream(h.c).sorted(new Comparator() { // from class: axgn
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        ewwl ewwlVar = (ewwl) obj;
                        ewwl ewwlVar2 = (ewwl) obj2;
                        if (ewwlVar == null || ewwlVar2 == null) {
                            return 0;
                        }
                        ffaa ffaaVar = ewwlVar.c;
                        if (ffaaVar == null) {
                            ffaaVar = ffaa.a;
                        }
                        fezs fezsVar = ffaaVar.c;
                        if (fezsVar == null) {
                            fezsVar = fezs.a;
                        }
                        ffaa ffaaVar2 = ewwlVar2.c;
                        if (ffaaVar2 == null) {
                            ffaaVar2 = ffaa.a;
                        }
                        fezs fezsVar2 = ffaaVar2.c;
                        if (fezsVar2 == null) {
                            fezsVar2 = fezs.a;
                        }
                        return CrisisAlertsGoogleInternalSettingChimeraActivity.a(fezsVar, fezsVar2);
                    }
                }).forEach(new Consumer() { // from class: axgo
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void q(Object obj) {
                        ewwl ewwlVar = (ewwl) obj;
                        if (ewwlVar == null) {
                            return;
                        }
                        TextView textView3 = new TextView(CrisisAlertsGoogleInternalSettingChimeraActivity.this);
                        textView3.setPadding(1, 1, 2, 2);
                        textView3.setTextIsSelectable(true);
                        Locale locale = Locale.US;
                        ffaa ffaaVar = ewwlVar.c;
                        if (ffaaVar == null) {
                            ffaaVar = ffaa.a;
                        }
                        fezs fezsVar = ffaaVar.c;
                        if (fezsVar == null) {
                            fezsVar = fezs.a;
                        }
                        String str = fezsVar.c;
                        ffaa ffaaVar2 = ewwlVar.c;
                        if (ffaaVar2 == null) {
                            ffaaVar2 = ffaa.a;
                        }
                        fezs fezsVar2 = ffaaVar2.c;
                        if (fezsVar2 == null) {
                            fezsVar2 = fezs.a;
                        }
                        fefi fefiVar = fezsVar2.d;
                        if (fefiVar == null) {
                            fefiVar = fefi.a;
                        }
                        Long valueOf = Long.valueOf(fegx.b(fefiVar));
                        ffaa ffaaVar3 = ewwlVar.c;
                        if (ffaaVar3 == null) {
                            ffaaVar3 = ffaa.a;
                        }
                        fezs fezsVar3 = ffaaVar3.c;
                        if (fezsVar3 == null) {
                            fezsVar3 = fezs.a;
                        }
                        fefi fefiVar2 = fezsVar3.d;
                        if (fefiVar2 == null) {
                            fefiVar2 = fefi.a;
                        }
                        Instant d = fegu.d(fefiVar2);
                        ffaa ffaaVar4 = ewwlVar.c;
                        if (ffaaVar4 == null) {
                            ffaaVar4 = ffaa.a;
                        }
                        fezs fezsVar4 = ffaaVar4.c;
                        if (fezsVar4 == null) {
                            fezsVar4 = fezs.a;
                        }
                        fefi fefiVar3 = fezsVar4.d;
                        if (fefiVar3 == null) {
                            fefiVar3 = fefi.a;
                        }
                        ZonedDateTime atZone = fegu.d(fefiVar3).atZone(ZoneId.systemDefault());
                        String str2 = ewwlVar.f;
                        fefi fefiVar4 = ewwlVar.d;
                        if (fefiVar4 == null) {
                            fefiVar4 = fefi.a;
                        }
                        Instant d2 = fegu.d(fefiVar4);
                        fefi fefiVar5 = ewwlVar.d;
                        if (fefiVar5 == null) {
                            fefiVar5 = fefi.a;
                        }
                        ZonedDateTime atZone2 = fegu.d(fefiVar5).atZone(ZoneId.systemDefault());
                        ffaa ffaaVar5 = ewwlVar.c;
                        if (ffaaVar5 == null) {
                            ffaaVar5 = ffaa.a;
                        }
                        fezu fezuVar = ffaaVar5.h;
                        if (fezuVar == null) {
                            fezuVar = fezu.a;
                        }
                        String str3 = fezuVar.b;
                        ffaa ffaaVar6 = ewwlVar.c;
                        if (ffaaVar6 == null) {
                            ffaaVar6 = ffaa.a;
                        }
                        fezu fezuVar2 = ffaaVar6.h;
                        if (fezuVar2 == null) {
                            fezuVar2 = fezu.a;
                        }
                        febp febpVar = fezuVar2.c;
                        if (febpVar == null) {
                            febpVar = febp.a;
                        }
                        LinearLayout linearLayout3 = linearLayout;
                        textView3.setText(iro.a(String.format(locale, "<i>id:<i/> {<b>%s</b>, %d[%s | %s]}<br>%s<br><i>shown:</i> %s[%s]<br><i>throttling:</i> {<b>%s</b>, %ds}<br><hr>", str, valueOf, d, atZone, str2, d2, atZone2, str3, Long.valueOf(fegt.g(febpVar))), 63));
                        linearLayout3.addView(textView3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                textView2.setText(String.format(Locale.US, "Rejected: %d", Integer.valueOf(h.b.size())));
                Collection.EL.stream(h.b).sorted(new Comparator() { // from class: axgp
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        ewwn ewwnVar = (ewwn) obj;
                        ewwn ewwnVar2 = (ewwn) obj2;
                        if (ewwnVar == null || ewwnVar2 == null) {
                            return 0;
                        }
                        fezs fezsVar = ewwnVar.c;
                        if (fezsVar == null) {
                            fezsVar = fezs.a;
                        }
                        fezs fezsVar2 = ewwnVar2.c;
                        if (fezsVar2 == null) {
                            fezsVar2 = fezs.a;
                        }
                        return CrisisAlertsGoogleInternalSettingChimeraActivity.a(fezsVar, fezsVar2);
                    }
                }).forEach(new Consumer() { // from class: axgq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void q(Object obj) {
                        ewwn ewwnVar = (ewwn) obj;
                        if (ewwnVar == null) {
                            return;
                        }
                        TextView textView3 = new TextView(CrisisAlertsGoogleInternalSettingChimeraActivity.this);
                        textView3.setPadding(1, 1, 2, 2);
                        textView3.setTextIsSelectable(true);
                        Locale locale = Locale.US;
                        fezs fezsVar = ewwnVar.c;
                        if (fezsVar == null) {
                            fezsVar = fezs.a;
                        }
                        String str = fezsVar.c;
                        fezs fezsVar2 = ewwnVar.c;
                        if (fezsVar2 == null) {
                            fezsVar2 = fezs.a;
                        }
                        fefi fefiVar = fezsVar2.d;
                        if (fefiVar == null) {
                            fefiVar = fefi.a;
                        }
                        Long valueOf = Long.valueOf(fegx.b(fefiVar));
                        fezs fezsVar3 = ewwnVar.c;
                        if (fezsVar3 == null) {
                            fezsVar3 = fezs.a;
                        }
                        fefi fefiVar2 = fezsVar3.d;
                        if (fefiVar2 == null) {
                            fefiVar2 = fefi.a;
                        }
                        Instant d = fegu.d(fefiVar2);
                        fezs fezsVar4 = ewwnVar.c;
                        if (fezsVar4 == null) {
                            fezsVar4 = fezs.a;
                        }
                        fefi fefiVar3 = fezsVar4.d;
                        if (fefiVar3 == null) {
                            fefiVar3 = fefi.a;
                        }
                        ZonedDateTime atZone = fegu.d(fefiVar3).atZone(ZoneId.systemDefault());
                        String str2 = ewwnVar.g;
                        Integer valueOf2 = Integer.valueOf(ewwnVar.d);
                        fefi fefiVar4 = ewwnVar.e;
                        if (fefiVar4 == null) {
                            fefiVar4 = fefi.a;
                        }
                        Instant d2 = fegu.d(fefiVar4);
                        fefi fefiVar5 = ewwnVar.e;
                        if (fefiVar5 == null) {
                            fefiVar5 = fefi.a;
                        }
                        LinearLayout linearLayout3 = linearLayout2;
                        textView3.setText(iro.a(String.format(locale, "<i>id:</i> {<b>%s</b>, %d[%s | %s]}<br>%s<br><i>rsn:</i> <b>%d</b><br><i>r1st ej:</i> %s[%s]<br><hr>", str, valueOf, d, atZone, str2, valueOf2, d2, fegu.d(fefiVar5).atZone(ZoneId.systemDefault())), 63));
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
